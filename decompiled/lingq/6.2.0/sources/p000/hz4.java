package p000;

import android.os.Bundle;
import androidx.compose.foundation.C0125l;
import androidx.compose.foundation.lazy.staggeredgrid.C0144d;
import androidx.compose.material3.C0269z;
import androidx.compose.material3.SheetValue;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$PushEnabledSource;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.feature.lessoninfo.LessonInfoFragment;
import com.lingq.feature.playlist.C2255e;
import com.lingq.feature.playlist.PlaylistFragment;
import com.lingq.feature.reader.old.ReaderPageFragment;
import com.lingq.feature.reader.old.settings.LessonReviewMenuFragment;
import com.lingq.feature.reader.old.tutorial.LessonDealWithWordsFragment;
import com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment;
import com.lingq.feature.reader.old.vocabulary.LessonVocabularyFragment;
import com.lingq.feature.reader.video.C2583a;
import com.lingq.feature.review.ReviewSessionCompleteFragment;
import com.lingq.feature.review.activities.ReviewActivityFlashcardFragment;
import com.lingq.feature.review.activities.ReviewActivityMatchingFragment;
import com.lingq.feature.review.activities.ReviewActivityMultiAndClozeFragment;
import com.lingq.feature.review.activities.ReviewActivityResultFragment;
import com.lingq.feature.review.activities.ReviewActivitySpeakingFragment;
import com.lingq.feature.review.activities.ReviewActivityUnscrambleFragment;
import com.lingq.feature.statistics.LingQMethodFragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hz4 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43240a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43241b;

    public /* synthetic */ hz4(Object obj, int i) {
        this.f43240a = i;
        this.f43241b = obj;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f43240a;
        boolean z = true;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f43241b;
        switch (i) {
            case 0:
                List list = ((C0144d) obj).m1023g().f36307m;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((fw4) it.next()).f39786b.equals("nextLesson")) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                ((cy4) obj).mo9441g();
                return xfaVar;
            case 2:
                bh4[] bh4VarArr = LessonDealWithWordsFragment.f29486Z0;
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = ((LessonDealWithWordsFragment) obj).m2091S().m2106h().f5723A;
                abstractComponentCallbacksC0635c.getClass();
                return abstractComponentCallbacksC0635c;
            case 3:
                bia biaVar = ((LessonInfoFragment) obj).f26344T0;
                if (biaVar != null) {
                    biaVar.mo3737M1(UpgradeReason.PLAYLISTS);
                    return xfaVar;
                }
                fa4.m11636J("upgradePopupDelegate");
                throw null;
            case 4:
                bh4[] bh4VarArr2 = LessonMoveKnownFragment.f29562H0;
                return ((LessonMoveKnownFragment) obj).m2091S();
            case 5:
                bh4[] bh4VarArr3 = LessonReviewMenuFragment.f29427G0;
                return ((LessonReviewMenuFragment) obj).m2091S();
            case 6:
                LessonVocabularyFragment lessonVocabularyFragment = (LessonVocabularyFragment) obj;
                bh4[] bh4VarArr4 = LessonVocabularyFragment.f29676G0;
                return lessonVocabularyFragment;
            case 7:
                b34.m3244j((LingQMethodFragment) obj).m22689f();
                return xfaVar;
            case 8:
                C0125l c0125l = (C0125l) obj;
                sc9 sc9Var = c0125l.f2411L;
                if (sc9Var.m21222h() <= c0125l.f2412M.m21222h()) {
                    return null;
                }
                ((iq5) ((xc9) c0125l.f2417R).getValue()).getClass();
                return Float.valueOf(c0125l.m965Z0() + sc9Var.m21222h());
            case 9:
                return Boolean.valueOf(((SheetValue) ((C0269z) obj).f3650d.getValue()) != SheetValue.Hidden);
            case 10:
                Bundle bundle = new Bundle();
                bundle.putString("push enabled source", LqAnalyticsValues$PushEnabledSource.DailyGoal.getValue());
                ((C1240a) ((hm5) obj)).m7025f("Push notifications enabled", bundle);
                return xfaVar;
            case 11:
                return "Unexpected end of input: yet to parse ".concat(((zo6) obj).m25725b());
            case 12:
                return ux5.m22992o(new StringBuilder("Unexpected end of input: yet to parse '"), ((s87) obj).f60513a, '\'');
            case 13:
                return (PlaylistFragment) obj;
            case 14:
                ((C2255e) obj).mo3737M1(UpgradeReason.PLAYLISTS);
                return xfaVar;
            case 15:
                ((oe7) obj).f54248a.setValue(Boolean.FALSE);
                return xfaVar;
            case 16:
                xg7 xg7Var = (xg7) obj;
                return new ql1(pb1.m19041k("kotlinx.serialization.Polymorphic", tg7.f62256y, new SerialDescriptor[0], new cg7(xg7Var, z ? 1 : 0)), xg7Var.f68183a);
            case 17:
                return Float.valueOf(((C2907cy) ((jy7) obj).f46404l).f34700c / 100.0f);
            case 18:
                return Integer.valueOf(((yz4) obj).f70670d.size());
            case 19:
                vx7 vx7Var = ReaderPageFragment.Companion;
                return ((ReaderPageFragment) obj).m2091S();
            case 20:
                ((C2583a) obj).m9509V2(lqa.f50017a);
                return xfaVar;
            case 21:
                bh4[] bh4VarArr5 = ReviewActivityFlashcardFragment.f31913H0;
                return ((ReviewActivityFlashcardFragment) obj).m2091S().m2091S();
            case 22:
                bh4[] bh4VarArr6 = ReviewActivityMatchingFragment.f31969F0;
                return ((ReviewActivityMatchingFragment) obj).m2091S().m2091S();
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                bh4[] bh4VarArr7 = ReviewActivityMultiAndClozeFragment.f32016I0;
                return ((ReviewActivityMultiAndClozeFragment) obj).m2091S().m2091S();
            case 24:
                bh4[] bh4VarArr8 = ReviewActivityResultFragment.f32067H0;
                return ((ReviewActivityResultFragment) obj).m2091S().m2091S();
            case 25:
                bh4[] bh4VarArr9 = ReviewActivitySpeakingFragment.f32136H0;
                return ((ReviewActivitySpeakingFragment) obj).m2091S().m2091S();
            case 26:
                bh4[] bh4VarArr10 = ReviewActivityUnscrambleFragment.f32209F0;
                return ((ReviewActivityUnscrambleFragment) obj).m2091S().m2091S();
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                bh4[] bh4VarArr11 = ReviewSessionCompleteFragment.f31753G0;
                return ((ReviewSessionCompleteFragment) obj).m2091S().m2091S();
            case 28:
                return ((Callable) obj).call();
            default:
                ((Runnable) obj).run();
                return xfaVar;
        }
    }
}
