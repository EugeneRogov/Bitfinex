package ru.eugenerogov.ui

import androidx.lifecycle.ViewModel
import ru.eugenerogov.data.Currency

class CurrencyListViewModel : ViewModel() {

    private val currencyList = mutableSetOf<Currency>()

    init {
        for (i in 0 until 2) {
            val currency = Currency()
            currency.currencyPair = "ETH/USD"
            currency.lastPrice = 1334.0
            currency._24HoursChange = 6.7F
            currencyList += currency
        }

    }

}