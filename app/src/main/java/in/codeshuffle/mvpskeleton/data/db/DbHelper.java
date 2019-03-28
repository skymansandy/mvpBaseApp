package in.codeshuffle.mvpskeleton.data.db;

import in.codeshuffle.mvpskeleton.data.db.model.Option;
import in.codeshuffle.mvpskeleton.data.db.model.Question;
import in.codeshuffle.mvpskeleton.data.db.model.User;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by skymansandy on 08/12/16.
 */

public interface DbHelper {

    Observable<Long> insertUser(final User user);

    Observable<List<User>> getAllUsers();

    Observable<List<Question>> getAllQuestions();

    Observable<Boolean> isQuestionEmpty();

    Observable<Boolean> isOptionEmpty();

    Observable<Boolean> saveQuestion(Question question);

    Observable<Boolean> saveOption(Option option);

    Observable<Boolean> saveQuestionList(List<Question> questionList);

    Observable<Boolean> saveOptionList(List<Option> optionList);
}
