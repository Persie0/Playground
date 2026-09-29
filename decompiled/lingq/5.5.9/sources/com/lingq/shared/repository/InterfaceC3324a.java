package com.lingq.shared.repository;

import com.lingq.shared.uimodel.lesson.LessonStudy;
import com.lingq.shared.uimodel.lesson.LessonStudyBookmark;
import com.lingq.shared.uimodel.lesson.LessonStudySentence;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import com.lingq.shared.uimodel.library.CollectionsFilterLessonTag;
import com.lingq.shared.uimodel.library.CollectionsFilterUser;
import com.lingq.shared.uimodel.library.LessonInfo;
import java.util.ArrayList;
import java.util.List;
import ki.C6695a;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p159hi.C6050a;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: com.lingq.shared.repository.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3324a {

    /* JADX INFO: renamed from: com.lingq.shared.repository.a$a */
    public static final class a {
    }

    /* JADX INFO: renamed from: A */
    InterfaceC7116c<LessonStudyTranslationSentence> mo9479A(int i10, int i11);

    /* JADX INFO: renamed from: B */
    Object mo9480B(String str, String str2, String str3, InterfaceC9968c<? super LessonStudy> interfaceC9968c);

    /* JADX INFO: renamed from: C */
    Object mo9481C(int i10, boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: D */
    Object mo9482D(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: E */
    Object mo9483E(int i10, int i11, String str, InterfaceC9968c interfaceC9968c, boolean z10);

    /* JADX INFO: renamed from: F */
    Object mo9484F(int i10, boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: G */
    Object mo9485G(int i10, int i11, int i12, int i13, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: H */
    InterfaceC7116c<String> mo9486H(String str, int i10);

    /* JADX INFO: renamed from: I */
    InterfaceC7116c<List<CollectionsFilterUser>> mo9487I(String str, String str2);

    /* JADX INFO: renamed from: J */
    void mo9488J(String str, int i10, String str2);

    /* JADX INFO: renamed from: K */
    Object mo9489K(int i10, int i11, InterfaceC9968c<? super LessonStudySentence> interfaceC9968c);

    /* JADX INFO: renamed from: L */
    Object mo9490L(int i10, int i11, String str, InterfaceC9968c interfaceC9968c, boolean z10);

    /* JADX INFO: renamed from: M */
    Object mo9491M(int i10, String str, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: N */
    Object mo9492N(int i10, String str, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: O */
    Object mo9493O(int i10, int i11, boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: P */
    InterfaceC7116c<C6695a> mo9494P(int i10);

    /* JADX INFO: renamed from: Q */
    Object mo9495Q(double d10, double d11, int i10, String str, InterfaceC9968c interfaceC9968c, boolean z10);

    /* JADX INFO: renamed from: R */
    Object mo9496R(int i10, int i11, double d10, int i12, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: S */
    Object mo9497S(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: T */
    InterfaceC7116c<C6695a> mo9498T(int i10);

    /* JADX INFO: renamed from: U */
    Object mo9499U(int i10, int i11, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: V */
    Object mo9500V(int i10, int i11, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: W */
    Object mo9501W(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: X */
    InterfaceC7116c mo9502X(int i10);

    /* JADX INFO: renamed from: Y */
    Object mo9503Y(int i10, int i11, String str, String str2, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: Z */
    Object mo9504Z(int i10, int i11, String str, String str2, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: a */
    Object mo9505a(int i10, InterfaceC9968c<? super LessonInfo> interfaceC9968c);

    /* JADX INFO: renamed from: a0 */
    Object mo9506a0(int i10, String str, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: b */
    InterfaceC7116c<LessonInfo> mo9507b(int i10);

    /* JADX INFO: renamed from: c */
    Object mo9509c(int i10, String str, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: d */
    Object mo9511d(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: e */
    InterfaceC7116c<C6050a> mo9513e(int i10);

    /* JADX INFO: renamed from: f */
    Object mo9515f(String str, InterfaceC9968c<? super Integer> interfaceC9968c);

    /* JADX INFO: renamed from: g */
    Object mo9517g(int i10, String str, ArrayList arrayList, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: h */
    Object mo9519h(String str, String str2, InterfaceC9968c<? super Integer> interfaceC9968c);

    /* JADX INFO: renamed from: i */
    InterfaceC7116c mo9521i(String str);

    /* JADX INFO: renamed from: j */
    Object mo9522j(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: k */
    C7136q mo9523k(String str, int i10, boolean z10);

    /* JADX INFO: renamed from: l */
    Object mo9524l(String str, int i10, boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: m */
    Object mo9525m(int i10, InterfaceC9968c<? super LessonStudyBookmark> interfaceC9968c);

    /* JADX INFO: renamed from: n */
    Object mo9526n(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: o */
    Object mo9527o(int i10, int i11, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: p */
    Object mo9528p(int i10, int i11, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: q */
    Object mo9529q(String str, String str2, String str3, String str4, boolean z10, int i10, String str5, InterfaceC9968c<? super LessonStudy> interfaceC9968c);

    /* JADX INFO: renamed from: r */
    Object mo9530r(double d10, double d11, int i10, String str, InterfaceC9968c interfaceC9968c, boolean z10);

    /* JADX INFO: renamed from: s */
    Object mo9531s(int i10, String str, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: t */
    Object mo9532t(int i10, int i11, String str, String str2, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: u */
    Object mo9533u(int i10, String str, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: v */
    Object mo9534v(int i10, int i11, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: w */
    InterfaceC7116c mo9535w(int i10, String str);

    /* JADX INFO: renamed from: x */
    Object mo9536x(int i10, int i11, String str, String str2, InterfaceC9968c interfaceC9968c);

    /* JADX INFO: renamed from: y */
    InterfaceC7116c mo9537y(int i10);

    /* JADX INFO: renamed from: z */
    InterfaceC7116c<List<CollectionsFilterLessonTag>> mo9538z(String str);
}
