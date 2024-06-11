@file:Suppress("ktlint:standard:filename", "RedundantSemicolon")

package utils.message;

import utils.color.blue;
import utils.color.green;
import utils.color.red;

/**
 * Message object that contains some methods to print notification messages
 *
 * @author SKN Shukhan
 * Version: 1.0.0
 * @since 2024-06-10
 * */
object Message {
  /**
   * Outputs error message of red colored variant on console when a process fails to complete
   *
   * Example:
   *
   * ```kotlin
   * println(Message.errorConsole("Task failed!"));
   * ```
   *
   * @param message a String containing the actual error message
   * @return a String containing formatted error message
   * @since v1.0.0
   * */
  fun errorConsole(message: String): String = "${message.red()} ❌"

  /**
   * Outputs error message of red colored variant as server response on API request failure
   *
   * Example:
   *
   * ```kotlin
   * println(Message.errorServer("Failed to send mail!"));
   * ```
   *
   * @param message a String containing the actual error message
   * @return a String containing formatted error message
   * @since v1.0.0
   * */
  fun errorServer(message: String): String = "Error: $message ❌"

  /**
   * Outputs success message of green colored variant on console when a process succeeds to complete
   *
   * Example:
   *
   * ```kotlin
   * println(Message.successConsole("Task finished successfully!"));
   * ```
   *
   * @param message a String containing the actual success message
   * @return a String containing formatted success message
   * @since v1.0.0
   * */
  fun successConsole(message: String): String = "${message.green()} ✅"

  /**
   * Outputs success message of green colored variant as server response on API request success
   *
   * Example:
   *
   * ```kotlin
   * println(Message.successServer("Mail sent successfully!"));
   * ```
   *
   * @param message a String containing the actual success message
   * @return a String containing formatted success message
   * @since v1.0.0
   * */
  fun successServer(message: String): String = "Success: $message ✅"

  /**
   * Outputs info message of blue colored variant on console when a process needs to notify something excluding failure
   * and success
   *
   * Example:
   *
   * ```kotlin
   * println(Message.infoConsole("The task can be closed as the service has already been started!"));
   * ```
   *
   * @param message a String containing the actual info message
   * @return a String containing formatted info message
   * @since v1.0.0
   * */
  fun infoConsole(message: String): String = "${message.blue()} \uD83D\uDCDA"

  /**
   * Outputs info message of blue colored variant as server response on API request success/failure
   *
   * ```kotlin
   * println(Message.infoServer("The current process can be stopped as its only purpose was to initiate the service"));
   * ```
   *
   * @param message a String containing the actual info message
   * @return a String containing formatted info message
   * @since v1.0.0
   * */
  fun infoServer(message: String): String = "Info: $message \uD83D\uDCDA"
}
