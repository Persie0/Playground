package p000;

import android.content.Context;
import android.net.Uri;
import android.speech.SpeechRecognizer;
import androidx.compose.animation.core.C0059a;
import androidx.compose.p002ui.focus.FocusStateImpl;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.p002ui.semantics.C0427g;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.lifecycle.Lifecycle$State;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.library.CollectionsFilter;
import com.lingq.core.domain.model.library.LibrarySearchQuery;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.settings.ViewKeys;
import com.lingq.core.settings.review.C1880a;
import com.lingq.core.settings.theme.C1883c;
import com.lingq.core.token.TokenPopupData;
import com.lingq.core.token.TokenViewState;
import com.lingq.feature.reader.old.C2411m;
import com.lingq.feature.reader.old.C2412n;
import com.lingq.feature.reader.old.ReaderPageFragment;
import com.lingq.feature.reader.reader.C2493a;
import com.lingq.feature.reader.video.C2583a;
import com.lingq.feature.review.C2751b;
import com.lingq.feature.review.state.C2761a;
import com.lingq.feature.review.state.C2764d;
import com.lingq.feature.review.views.unscrambler.SentenceBuilderView;
import com.lingq.feature.search.filter.C2770a;
import com.lingq.feature.statistics.StatsShareFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC3194a;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sx7 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61552a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f61553b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f61554c;

    public /* synthetic */ sx7(int i, Object obj, Object obj2) {
        this.f61552a = i;
        this.f61553b = obj;
        this.f61554c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [android.util.AttributeSet, y52] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r1v51, types: [com.lingq.feature.review.views.unscrambler.SentenceBuilderView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v5, types: [com.lingq.core.domain.model.library.CollectionsFilter] */
    /* JADX WARN: Type inference failed for: r2v49, types: [boolean] */
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Map mapM15360M;
        Map mapM15360M2;
        int i = this.f61552a;
        int i2 = 11;
        int i3 = 5;
        int i4 = 6;
        int i5 = 7;
        int i6 = 3;
        int i7 = 2;
        ?? r10 = 0;
        Object obj2 = null;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f61554c;
        Object obj4 = this.f61553b;
        switch (i) {
            case 0:
                ReaderPageFragment readerPageFragment = (ReaderPageFragment) obj4;
                dh9 dh9Var = (dh9) obj3;
                w65 w65Var = (w65) obj;
                vx7 vx7Var = ReaderPageFragment.Companion;
                w65Var.getClass();
                boolean z4 = w65Var instanceof LessonCard;
                TokenViewState.Expanded expanded = TokenViewState.Expanded.f23709a;
                if (z4) {
                    C2411m c2411mM9299X0 = readerPageFragment.m9299X0();
                    String str = ((LessonCard) w65Var).f19178a;
                    xz7 xz7VarM9305Z2 = c2411mM9299X0.m9305Z2(str);
                    C2412n c2412nM9298W0 = readerPageFragment.m9298W0();
                    String strM23609O = vz1.m23609O(str, readerPageFragment.m9299X0().f29223b.mo4589b2());
                    TokenType tokenType = TokenType.CardType;
                    TokenControllerType tokenControllerType = TokenControllerType.Lesson;
                    int i8 = xz7VarM9305Z2 != null ? xz7VarM9305Z2.f69010g : 0;
                    int i9 = xz7VarM9305Z2 != null ? xz7VarM9305Z2.f69011h : 0;
                    if (xz7VarM9305Z2 == null || (mapM15360M2 = xz7VarM9305Z2.f69017n) == null) {
                        mapM15360M2 = AbstractC3194a.m15360M();
                    }
                    c2412nM9298W0.f29344c.mo8738E1(new TokenPopupData(str, strM23609O, tokenType, 0, 0, null, expanded, tokenControllerType, null, 0, null, false, i8, i9, mapM15360M2, 0, 0, 0, 0, false, null, null, false, 8359736, null));
                } else if (w65Var instanceof LessonWord) {
                    if (((Boolean) dh9Var.getValue()).booleanValue()) {
                        C2411m c2411mM9299X1 = readerPageFragment.m9299X0();
                        String str2 = ((LessonWord) w65Var).f19314a;
                        xz7 xz7VarM9305Z3 = c2411mM9299X1.m9305Z2(str2);
                        C2412n c2412nM9298W1 = readerPageFragment.m9298W0();
                        String strM23609O2 = vz1.m23609O(str2, readerPageFragment.m9299X0().f29223b.mo4589b2());
                        TokenType tokenType2 = TokenType.WordType;
                        TokenControllerType tokenControllerType2 = TokenControllerType.Lesson;
                        int i10 = xz7VarM9305Z3 != null ? xz7VarM9305Z3.f69010g : 0;
                        int i11 = xz7VarM9305Z3 != null ? xz7VarM9305Z3.f69011h : 0;
                        if (xz7VarM9305Z3 == null || (mapM15360M = xz7VarM9305Z3.f69017n) == null) {
                            mapM15360M = AbstractC3194a.m15360M();
                        }
                        c2412nM9298W1.f29344c.mo8738E1(new TokenPopupData(str2, strM23609O2, tokenType2, 0, 0, null, expanded, tokenControllerType2, null, 0, null, false, i10, i11, mapM15360M, 0, 0, 0, 0, false, null, null, false, 8359736, null));
                    } else {
                        readerPageFragment.m9298W0().mo3737M1(UpgradeReason.LIMIT_WORDS);
                    }
                }
                return xfaVar;
            case 1:
                ub5 ub5Var = (ub5) obj4;
                C2493a c2493a = (C2493a) obj3;
                ((ai2) obj).getClass();
                q03 q03Var = new q03(c2493a, z ? 1 : 0);
                ub5Var.mo256K().mo21323g(q03Var);
                if (ub5Var.mo256K().mo21327q().isAtLeast(Lifecycle$State.RESUMED)) {
                    c2493a.m9389V2(fs7.f39592a);
                }
                return new j91(i3, ub5Var, q03Var);
            case 2:
                vu4 vu4Var = (vu4) obj;
                vu4Var.getClass();
                List list = ((sz7) obj4).f61674a;
                vu4Var.m23547h(list.size(), null, new C3520r2(27, list), new C0282a(802480018, true, new df2(i6, (vi3) obj3, list)));
                return xfaVar;
            case 3:
                ub5 ub5Var2 = (ub5) obj4;
                C2583a c2583a = (C2583a) obj3;
                ((ai2) obj).getClass();
                q03 q03Var2 = new q03(c2583a, i7);
                ub5Var2.mo256K().mo21323g(q03Var2);
                if (ub5Var2.mo256K().mo21327q().isAtLeast(Lifecycle$State.RESUMED)) {
                    c2583a.m9509V2(wqa.f67194a);
                }
                return new j91(i4, ub5Var2, q03Var2);
            case 4:
                C2583a c2583a2 = (C2583a) obj4;
                C1883c c1883c = (C1883c) obj3;
                xy9 xy9Var = (xy9) obj;
                xy9Var.getClass();
                if (xy9Var instanceof gy9) {
                    c2583a2.m9509V2(rqa.f59729a);
                } else {
                    c1883c.m8688Z2(xy9Var);
                }
                return xfaVar;
            case 5:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                return ((u38) obj4).f63360L.m3843Y(bk8Var, (ArrayList) obj3);
            case 6:
                Context context = (Context) obj4;
                Uri uri = (Uri) obj;
                uri.getClass();
                String string = context.getString(R$string.quickstart_congratulations);
                string.getClass();
                AbstractC3423or.m18249d0(context, uri, string, (String) obj3);
                return xfaVar;
            case 7:
                q98 q98Var = (q98) obj;
                q98Var.getClass();
                q98Var.m19821m(((Number) ((C0059a) obj4).m745d()).floatValue());
                q98Var.m19815e(((fb2) obj3).mo594a() * 18.0f * 72.0f);
                return xfaVar;
            case 8:
                vu4 vu4Var2 = (vu4) obj;
                vu4Var2.getClass();
                List list2 = ((qc8) obj4).f57574h;
                vu4Var2.m23547h(list2.size(), new C3520r2(new qv7(i2), list2), new C3520r2(29, list2), new C0282a(802480018, true, new df2(4, (vi3) obj3, list2)));
                return xfaVar;
            case 9:
                C2751b c2751b = (C2751b) obj4;
                nb8 nb8Var = (nb8) obj3;
                hg8 hg8Var = (hg8) obj;
                hg8Var.getClass();
                C2764d c2764d = c2751b.f32396d;
                int i12 = c2764d.f32757p + 1;
                if (i12 < 0) {
                    i12 = 0;
                }
                be8 be8Var = new be8(i12, c2764d.f32756o.size());
                C2761a c2761a = c2751b.f32397e;
                c2761a.getClass();
                return hg8.m13232a(hg8Var, be8Var, null, null, !(nb8Var instanceof db8) ? !((nb8Var instanceof ib8) || (nb8Var instanceof lb8) || (nb8Var instanceof mb8)) : c2761a.m9627k(), null, null, null, null, 493);
            case 10:
                C2751b c2751b2 = (C2751b) obj4;
                hg8 hg8Var2 = (hg8) obj;
                hg8Var2.getClass();
                C2764d c2764d2 = c2751b2.f32396d;
                int i13 = c2764d2.f32758q;
                int size = c2764d2.f32756o.size();
                List<LessonCard> list3 = (List) obj3;
                ArrayList arrayList = new ArrayList(v91.m23189q0(list3, 10));
                for (LessonCard lessonCard : list3) {
                    String str3 = lessonCard.f19178a;
                    str3.getClass();
                    Locale localeForLanguageTag = Locale.forLanguageTag(c2764d2.f32742a.mo4589b2());
                    localeForLanguageTag.getClass();
                    String strM23610P = vz1.m23610P(str3, localeForLanguageTag);
                    Integer num = (Integer) c2764d2.f32759r.get(strM23610P);
                    int iIntValue = num != null ? num.intValue() : 0;
                    Integer num2 = (Integer) c2764d2.f32760s.get(strM23610P);
                    arrayList.add(new we8(lessonCard.f19178a, t7d.m21897b(lessonCard.f19183f), iIntValue, num2 != null ? num2.intValue() : 0, lessonCard.f19188k, lessonCard.f19189l, c2751b2.f32397e.m9626j(), c2764d2.f32761t));
                }
                return hg8.m13232a(hg8Var2, new be8(c2764d2.f32756o.size(), c2764d2.f32756o.size()), new cd8((bd8) null, (bd8) null, new ie8(com.lingq.feature.review.R$string.activities_new_session, c2751b2.f32403k.f37010h ? R$string.ui_close : com.lingq.feature.review.R$string.activities_return_to_lesson), 7), new xc8(new ze8(arrayList, i13, size)), false, null, null, null, null, 481);
            case 11:
                vu4 vu4Var3 = (vu4) obj;
                vu4Var3.getClass();
                ArrayList arrayList2 = ((ze8) obj4).f71463c;
                vu4Var3.m23547h(arrayList2.size(), new ue0(18, new qv7(13), arrayList2), new gm4(2, arrayList2), new C0282a(802480018, true, new jq0(arrayList2, (vi3) obj3, i7)));
                return xfaVar;
            case 12:
                ((vi3) obj4).invoke(new ma8(((we8) obj3).f66727a, ((Integer) obj).intValue()));
                return xfaVar;
            case 13:
                vu4 vu4Var4 = (vu4) obj;
                vu4Var4.getClass();
                List list4 = ((yf8) obj4).f69771a;
                vu4Var4.m23547h(list4.size(), null, new xf8(0, list4), new C0282a(802480018, true, new df2(i3, (vi3) obj3, list4)));
                return xfaVar;
            case 14:
                vi3 vi3Var = (vi3) obj4;
                C1880a c1880a = (C1880a) obj3;
                if8 if8Var = (if8) obj;
                if8Var.getClass();
                if (if8Var instanceof ff8) {
                    ViewKeys viewKeys = ((ff8) if8Var).f39010a;
                    Set set = i19.f43354a;
                    viewKeys.getClass();
                    if (i19.f43354a.contains(viewKeys)) {
                        vi3Var.invoke(new rf8(viewKeys));
                    } else {
                        c1880a.m8661W2(if8Var);
                    }
                } else {
                    c1880a.m8661W2(if8Var);
                }
                return xfaVar;
            case 15:
                SpeechRecognizer speechRecognizer = (SpeechRecognizer) obj4;
                ((ai2) obj).getClass();
                speechRecognizer.setRecognitionListener(new yb8((vi3) obj3, z2 ? 1 : 0));
                return new C3531rd(speechRecognizer, i4);
            case 16:
                Context context2 = (Context) obj;
                context2.getClass();
                SentenceBuilderView sentenceBuilderView = new SentenceBuilderView(context2, r10, i7, r10);
                sentenceBuilderView.setIsRTL(((ug8) obj4).f63896e);
                sentenceBuilderView.setListener(new ac8((vi3) obj3, z3 ? 1 : 0));
                return sentenceBuilderView;
            case 17:
                ug8 ug8Var = (ug8) obj4;
                sc9 sc9Var = (sc9) obj3;
                ?? r1 = (SentenceBuilderView) obj;
                r1.getClass();
                r1.setIsRTL(ug8Var.f63896e);
                int iM21222h = sc9Var.m21222h();
                int i14 = ug8Var.f63897f;
                if (iM21222h != i14) {
                    r1.m9665d(vk9.m23376L0(ug8Var.f63892a).toString(), (sc9Var.m21222h() == -1 ? 1 : 0) ^ 1);
                    sc9Var.m21223i(i14);
                }
                return xfaVar;
            case 18:
                String str4 = (String) obj4;
                ui3 ui3Var = (ui3) obj3;
                tv8 tv8Var = (tv8) obj;
                bh4[] bh4VarArr = AbstractC0426f.f5022a;
                C0427g c0427g = AbstractC0424d.f5014u;
                bh4 bh4Var = AbstractC0426f.f5022a[11];
                tv8Var.mo3709d(c0427g, Float.valueOf(1.0f));
                if (str4 != null) {
                    AbstractC0426f.m1860d(tv8Var, str4);
                }
                tv8Var.mo3709d(AbstractC0421a.f4946b, new C3024g3(null, new zy7(5, ui3Var)));
                return xfaVar;
            case 19:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                return ((np8) obj4).f53105L.m3843Y(bk8Var2, (List) obj3);
            case 20:
                vu4 vu4Var5 = (vu4) obj;
                vu4Var5.getClass();
                List list5 = ((gq8) obj4).f41193a;
                vu4Var5.m23547h(list5.size(), null, new xf8(2, list5), new C0282a(802480018, true, new df2(i4, (vi3) obj3, list5)));
                return xfaVar;
            case 21:
                String str5 = (String) obj4;
                C2770a c2770a = (C2770a) obj3;
                LibrarySearchQuery librarySearchQuery = (LibrarySearchQuery) obj;
                librarySearchQuery.getClass();
                if (!vk9.m23391n0(str5)) {
                    for (Object obj5 : ((yu8) c2770a.f32916k.getValue()).f70493d) {
                        if (fa4.m11650l(((CollectionsFilter) obj5).f19338b, str5)) {
                            obj2 = obj5;
                            r10 = (CollectionsFilter) obj2;
                        }
                    }
                    r10 = (CollectionsFilter) obj2;
                }
                return LibrarySearchQuery.m8091a(librarySearchQuery, null, null, null, null, null, r10, null, false, 7167);
            case 22:
                ui3 ui3Var2 = (ui3) obj4;
                FocusStateImpl focusStateImpl = (FocusStateImpl) obj;
                focusStateImpl.getClass();
                ((t66) obj3).setValue(Boolean.valueOf(focusStateImpl.isFocused()));
                if (focusStateImpl.isFocused() && ui3Var2 != null) {
                    ui3Var2.mo0a();
                }
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                vu4 vu4Var6 = (vu4) obj;
                vu4Var6.getClass();
                List list6 = ((fx8) obj4).f39901a;
                vu4Var6.m23547h(list6.size(), new ue0(23, new ow8(i6), list6), new xf8(7, list6), new C0282a(802480018, true, new df2(i5, (vi3) obj3, list6)));
                return xfaVar;
            case 24:
                oq7 oq7Var = (oq7) obj4;
                kg7 kg7Var = (kg7) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (ci8.m4702O(kg7Var, false) >> 32));
                boolean z5 = ((Ref$BooleanRef) obj3).f47713a;
                if (oq7Var.m18211e()) {
                    fIntBitsToFloat = -fIntBitsToFloat;
                }
                oq7Var.m18212f(fIntBitsToFloat, z5);
                kg7Var.m15189a();
                return xfaVar;
            case 25:
                Uri uri2 = (Uri) obj;
                bh4[] bh4VarArr2 = StatsShareFragment.f33326U0;
                uri2.getClass();
                AbstractC3423or.m18249d0(((StatsShareFragment) obj4).m2090R(), uri2, ((String) obj3).concat(" Stats"), "");
                return xfaVar;
            case 26:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ((sp9) obj4).f61207b.m20400B(bk8Var3, (rp9) obj3);
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ui3 ui3Var3 = (ui3) obj3;
                nt9 nt9Var = (nt9) obj;
                ((ui3) obj4).mo0a();
                if (ui3Var3 != null ? ((Boolean) ui3Var3.mo0a()).booleanValue() : true) {
                    nt9Var.close();
                }
                return xfaVar;
            case 28:
                vu4 vu4Var7 = (vu4) obj;
                vu4Var7.getClass();
                Object[] array = TextHighlightStyle.getEntries().toArray(new TextHighlightStyle[0]);
                vu4Var7.m23547h(array.length, null, new C3050gt(array, i6), new C0282a(-1781742563, true, new ve0(9, (vi3) obj3, array, (TextHighlightStyle) obj4)));
                return xfaVar;
            default:
                bk8 bk8Var4 = (bk8) obj;
                bk8Var4.getClass();
                ((v3a) obj4).f64801f.m3841W(bk8Var4, (o3a) obj3);
                return xfaVar;
        }
    }
}
