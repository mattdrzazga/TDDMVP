package com.example.com.tddmvp.list

import com.nhaarman.mockito_kotlin.*
import org.junit.Before
import org.junit.Test
import org.mockito.*

class ListPresenterTest {
    @Mock
    private lateinit var view: ListContract.View

    @Mock
    private lateinit var repository: DataSource

    private lateinit var presenter: Presenter

    @Captor
    lateinit var captor: ArgumentCaptor<DataSource.Callback>

    private val NAMES = listOf("Mateusz, Marcin, Drzazga")

    @Before
    fun setupPresenter() {
        MockitoAnnotations.initMocks(this)
        presenter = Presenter(view, repository)
    }

    @Test
    fun loadDataPresenterTest() {
//        val mock = mock<ListRepository> {
//            on { getData { doReturn(NAMES) } }
//        }
        presenter.loadData()
        verify(repository).getData(captor.capture())
        captor.value.onDataLoaded(NAMES)

        val inOrder = Mockito.inOrder(view)
        inOrder.verify(view).showProgress(true)
        inOrder.verify(view).showProgress(false)

        Mockito.verify(view).setList(NAMES)
    }
}
