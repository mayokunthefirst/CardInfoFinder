package com.mayokunadeniyi.data.mapper

import com.mayokunadeniyi.data.remote.response.Bank
import com.mayokunadeniyi.data.remote.response.CardInfoResponse
import com.mayokunadeniyi.data.remote.response.Country
import com.mayokunadeniyi.domain.models.CardInfo

/**
 * Created by Mayokun Adeniyi on 24/07/2020.
 */

class CardInfoMapperRemote : BaseMapperRepository<CardInfoResponse, CardInfo> {
    override fun transform(type: CardInfoResponse): CardInfo = CardInfo(
        type.bank?.name ?: "", type.brand ?: "", type.country?.name ?: "", type.type ?: ""
    )

    override fun transformToRepository(type: CardInfo): CardInfoResponse = CardInfoResponse(
        bank = Bank(type.bank), brand = type.brand, country = Country(type.country)
    )
}