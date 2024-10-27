package day4;
import org.hamcrest.Matchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.everyItem;

public class MatcherIntro {
    @Test
    public void test1(){
        assertThat(2+2, Matchers.is(4));
        assertThat(2+2, Matchers.equalTo(4));
        assertThat(2+2, Matchers.is(Matchers.equalTo(4)));

        assertThat(5+5,Matchers.not(9));
        assertThat(5+5,Matchers.is(Matchers.not(9)));
        assertThat(5+5,Matchers.is(Matchers.not(Matchers.equalTo(9))));

        assertThat(10,Matchers.is(Matchers.greaterThan(9)));

        assertThat("",Matchers.emptyString());
        assertThat("",Matchers.blankString());

        List<Integer> list=new ArrayList<>();
        assertThat(list,Matchers.hasSize(10));
        assertThat(list,Matchers.hasItem(15));
        assertThat(list,Matchers.hasItems(15,20,22));

        assertThat(list,everyItem(Matchers.greaterThan(5)));

    }
}
