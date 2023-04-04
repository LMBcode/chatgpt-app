package com.example.chatgptapp.model

data class CompletionResponse(
    val id: String,
    val obj: String,
    val created: Long,
    val model: String,
    val choices: List<Choice>,
    val usage: Usage
)

data class Choice(
    val text: String,
    val index: Int,
    val logprobs: Any?,
    val finish_reason: String
)

data class Usage(
    val prompt_tokens: Int,
    val completion_tokens: Int,
    val total_tokens: Int
)

