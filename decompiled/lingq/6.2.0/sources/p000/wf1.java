package p000;

import android.os.Bundle;
import androidx.compose.runtime.AbstractC0278f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.analytics.embedded.C1254d;
import com.lingq.core.analytics.embedded.EmbeddedMessageButton$$serializer;
import com.lingq.core.analytics.embedded.EmbeddedMessageElements;
import com.lingq.core.analytics.embedded.EmbeddedMessageText$$serializer;
import com.lingq.core.database.entity.C1344k;
import com.lingq.core.database.entity.C1360s;
import com.lingq.core.database.entity.LanguageCardsTagsEntity;
import com.lingq.core.database.entity.LessonEntity;
import com.lingq.core.domain.model.cup.C1416h;
import com.lingq.core.domain.model.cup.C1417i;
import com.lingq.core.domain.model.cup.CupMyStats;
import com.lingq.core.domain.model.cup.CupPrize;
import com.lingq.core.domain.model.cup.CupPrizeKind;
import com.lingq.core.domain.model.cup.CupPrizeSource;
import com.lingq.core.domain.model.lesson.C1436a;
import com.lingq.core.domain.model.lesson.C1438c;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence$$serializer;
import com.lingq.core.domain.model.lesson.LessonTransliteration$$serializer;
import com.lingq.core.domain.model.milestones.AbstractC1479h;
import com.lingq.core.domain.model.milestones.C1474c;
import com.lingq.core.domain.model.milestones.LessonAchievement;
import com.lingq.core.domain.model.milestones.LessonAchievementData$DailyGoal;
import com.lingq.core.domain.model.milestones.LessonAchievementData$DailyGoal$$serializer;
import com.lingq.core.domain.model.milestones.LessonAchievementData$KnownWords;
import com.lingq.core.domain.model.milestones.LessonAchievementData$KnownWords$$serializer;
import com.lingq.core.domain.model.milestones.LessonAchievementData$Level;
import com.lingq.core.domain.model.milestones.LessonAchievementData$Level$$serializer;
import com.lingq.core.domain.model.milestones.LessonAchievementData$StreakMilestone;
import com.lingq.core.domain.model.milestones.LessonAchievementData$StreakMilestone$$serializer;
import com.lingq.core.domain.model.milestones.LessonAchievementType;
import com.lingq.core.domain.model.token.TokenMeaning$$serializer;
import com.lingq.core.network.api.result.Book$$serializer;
import com.lingq.core.network.api.result.C1654g;
import com.lingq.core.network.api.result.Extra;
import java.lang.annotation.Annotation;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wf1 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66749a;

    public /* synthetic */ wf1(int i) {
        this.f66749a = i;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        switch (this.f66749a) {
            case 0:
                return new Bundle();
            case 1:
                cf1.m4606b("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            case 2:
                C1416h c1416h = CupMyStats.Companion;
                return new C2978ev(os1.Companion.serializer());
            case 3:
                C1417i c1417i = CupPrize.Companion;
                return CupPrizeKind.Companion.serializer();
            case 4:
                C1417i c1417i2 = CupPrize.Companion;
                return CupPrizeSource.Companion.serializer();
            case 5:
                return CupPrizeKind._init_$_anonymous_();
            case 6:
                return CupPrizeSource._init_$_anonymous_();
            case 7:
                return new lo8("kotlinx.datetime.DateTimeUnit.DateBased", y38.m24933a(k22.class), new z21[]{y38.m24933a(m22.class), y38.m24933a(o22.class)}, new KSerializer[]{w22.f66250a, v16.f64697a});
            case 8:
                return new lo8("kotlinx.datetime.DateTimeUnit", y38.m24933a(r22.class), new z21[]{y38.m24933a(m22.class), y38.m24933a(o22.class), y38.m24933a(q22.class)}, new KSerializer[]{w22.f66250a, v16.f64697a, l0a.f48874a});
            case 9:
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (vk9.m23391n0("kotlinx.datetime.DayBased")) {
                    C3386nv.m17626m("Blank serial names are prohibited");
                    return null;
                }
                a31 a31Var = new a31("kotlinx.datetime.DayBased");
                l84 l84Var = l84.f49294a;
                a31Var.m56a("days", l84.f49295b);
                return new zx8("kotlinx.datetime.DayBased", hl9.f42585y, a31Var.f165c.size(), AbstractC3550rv.m20852t0(serialDescriptorArr), a31Var);
            case 10:
                C1254d c1254d = EmbeddedMessageElements.Companion;
                return new C2978ev(EmbeddedMessageButton$$serializer.INSTANCE);
            case 11:
                C1254d c1254d2 = EmbeddedMessageElements.Companion;
                return new C2978ev(EmbeddedMessageText$$serializer.INSTANCE);
            case 12:
                C1654g c1654g = Extra.Companion;
                return new C2978ev(Book$$serializer.INSTANCE);
            case 13:
                return AbstractC0278f.m1260j(Boolean.FALSE);
            case 14:
                return AbstractC0278f.m1257g(-1);
            case 15:
                return AbstractC0278f.m1260j("");
            case 16:
                return Long.valueOf(System.nanoTime());
            case 17:
                C1344k c1344k = LanguageCardsTagsEntity.Companion;
                return new C2978ev(sk9.f60959a);
            case 18:
                int i = ex4.f38033h;
                return xfa.f68157a;
            case 19:
                C1436a c1436a = Lesson.Companion;
                return new C2978ev(thb.m22059r(LessonTranslationSentence$$serializer.INSTANCE));
            case 20:
                C1436a c1436a2 = Lesson.Companion;
                return new C2978ev(sk9.f60959a);
            case 21:
                C1474c c1474c = LessonAchievement.Companion;
                LessonAchievementType[] lessonAchievementTypeArrValues = LessonAchievementType.values();
                lessonAchievementTypeArrValues.getClass();
                return new zs2("com.lingq.core.domain.model.milestones.LessonAchievementType", lessonAchievementTypeArrValues);
            case 22:
                C1474c c1474c2 = LessonAchievement.Companion;
                return AbstractC1479h.Companion.serializer();
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return new lo8("com.lingq.core.domain.model.milestones.LessonAchievementData", y38.m24933a(AbstractC1479h.class), new z21[]{y38.m24933a(LessonAchievementData$DailyGoal.class), y38.m24933a(LessonAchievementData$KnownWords.class), y38.m24933a(LessonAchievementData$Level.class), y38.m24933a(LessonAchievementData$StreakMilestone.class)}, new KSerializer[]{LessonAchievementData$DailyGoal$$serializer.INSTANCE, LessonAchievementData$KnownWords$$serializer.INSTANCE, LessonAchievementData$Level$$serializer.INSTANCE, LessonAchievementData$StreakMilestone$$serializer.INSTANCE}, new Annotation[0]);
            case 24:
                C1438c c1438c = LessonCard.Companion;
                return new C2978ev(sk9.f60959a);
            case 25:
                C1438c c1438c2 = LessonCard.Companion;
                return new C2978ev(sk9.f60959a);
            case 26:
                C1438c c1438c3 = LessonCard.Companion;
                return new C2978ev(TokenMeaning$$serializer.INSTANCE);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                C1438c c1438c4 = LessonCard.Companion;
                return new C2978ev(sk9.f60959a);
            case 28:
                C1360s c1360s = LessonEntity.Companion;
                return new C2978ev(LessonTransliteration$$serializer.INSTANCE);
            default:
                C1360s c1360s2 = LessonEntity.Companion;
                return new C2978ev(LessonTransliteration$$serializer.INSTANCE);
        }
    }
}
