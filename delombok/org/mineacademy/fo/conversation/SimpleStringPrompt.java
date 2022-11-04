// Generated by delombok at Fri Nov 04 22:13:55 CST 2022
package org.mineacademy.fo.conversation;

import java.util.function.Consumer;
import org.bukkit.conversations.ConversationContext;
import org.bukkit.conversations.Prompt;
import org.bukkit.entity.Player;
import org.mineacademy.fo.Valid;
import org.mineacademy.fo.settings.SimpleLocalization;
import lombok.NonNull;

/**
 * A prompt that validates textual answers.
 */
public class SimpleStringPrompt extends SimplePrompt {
	/**
	 * The question you can set in the constructor already
	 */
	private String question = null;
	/**
	 * What happens when a valid text is entered
	 */
	private Consumer<String> successAction;

	/**
	 * Create a new prompt with bare question
	 *
	 * @param question
	 */
	public SimpleStringPrompt(String question) {
		this(question, null);
	}

	/**
	 * Create a new simple prompt with optionally returning to previous menu
	 *
	 * @param openMenu
	 */
	public SimpleStringPrompt(boolean openMenu) {
		super(openMenu);
	}

	/**
	 * The menu question
	 *
	 * @see org.mineacademy.fo.conversation.SimplePrompt#getPrompt(org.bukkit.conversations.ConversationContext)
	 */
	@Override
	protected String getPrompt(final ConversationContext ctx) {
		Valid.checkNotNull(this.question, "Please either call setQuestion or override getPrompt");
		return this.question;
	}

	/**
	 * Return true if input is not empty, it is advised to override this
	 *
	 * @see org.mineacademy.fo.conversation.SimplePrompt#isInputValid(org.bukkit.conversations.ConversationContext, java.lang.String)
	 */
	@Override
	protected boolean isInputValid(final ConversationContext context, final String input) {
		return !input.isEmpty();
	}

	/**
	 * Show the message when the input is not a number
	 *
	 * @see org.mineacademy.fo.conversation.SimplePrompt#getFailedValidationText(org.bukkit.conversations.ConversationContext, java.lang.String)
	 */
	@Override
	protected String getFailedValidationText(final ConversationContext context, final String invalidInput) {
		return SimpleLocalization.Commands.INVALID_STRING.replace("{input}", invalidInput);
	}

	/**
	 * Parse through
	 *
	 * @see org.bukkit.conversations.ValidatingPrompt#acceptValidatedInput(org.bukkit.conversations.ConversationContext, java.lang.String)
	 */
	@Override
	protected Prompt acceptValidatedInput(@NonNull final ConversationContext context, @NonNull final String input) {
		if (context == null) {
			throw new java.lang.NullPointerException("context is marked non-null but is null");
		}
		if (input == null) {
			throw new java.lang.NullPointerException("input is marked non-null but is null");
		}
		if (this.successAction != null) this.successAction.accept(input);
		 else this.onValidatedInput(context, input);
		return Prompt.END_OF_CONVERSATION;
	}

	/**
	 * Override this if you want a single question prompt and we have reached the end
	 *
	 * @param context
	 * @param input
	 */
	protected void onValidatedInput(ConversationContext context, String input) {
	}

	/**
	 * Show the question with the action to the player
	 *
	 * @param player
	 * @param question
	 * @param successAction
	 */
	public static void show(final Player player, final String question, final Consumer<String> successAction) {
		new SimpleStringPrompt(question, successAction).show(player);
	}

	@java.lang.SuppressWarnings("all")
	public SimpleStringPrompt() {
	}

	@java.lang.SuppressWarnings("all")
	public SimpleStringPrompt(final String question, final Consumer<String> successAction) {
		this.question = question;
		this.successAction = successAction;
	}

	/**
	 * The question you can set in the constructor already
	 */
	@java.lang.SuppressWarnings("all")
	protected void setQuestion(final String question) {
		this.question = question;
	}

	/**
	 * What happens when a valid text is entered
	 */
	@java.lang.SuppressWarnings("all")
	protected void setSuccessAction(final Consumer<String> successAction) {
		this.successAction = successAction;
	}
}
