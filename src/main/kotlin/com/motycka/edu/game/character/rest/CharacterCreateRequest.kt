package com.motycka.edu.game.character.rest

import com.motycka.edu.game.account.model.AccountId

data class CharacterCreateRequest(
    val accountId: AccountId,
    val name: String,
    val health: Int,
    val attack: Int,
    val experience: Int,
    val characterClass: String,
    val mana: Int? = null,
    val healing: Int? = null,
    val stamina: Int? = null,
    val defense: Int? = null
)
