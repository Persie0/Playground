package com.lingq.p055ui.lesson.page;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.page.data.TextTokenType;
import com.lingq.shared.uimodel.token.TokenRelatedPhrase;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C7076b;
import kotlinx.coroutines.flow.InterfaceC7137r;
import ni.C7793a;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p265mj.C7567a;
import p265mj.C7570d;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$8", m19206f = "LessonPageFragment.kt", m19207l = {491}, m19208m = "invokeSuspend")
public final class LessonPageFragment$onViewCreated$2$8 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28492e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageFragment f28493f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$8$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/token/TokenRelatedPhrase;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$8$1", m19206f = "LessonPageFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43681 extends SuspendLambda implements InterfaceC2056p<TokenRelatedPhrase, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28494e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonPageFragment f28495f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43681(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super C43681> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28495f = lessonPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43681 c43681 = new C43681(this.f28495f, interfaceC9968c);
            c43681.f28494e = obj;
            return c43681;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(TokenRelatedPhrase tokenRelatedPhrase, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43681) mo1336a(tokenRelatedPhrase, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x008b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            boolean z10;
            int i10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            TokenRelatedPhrase tokenRelatedPhrase = (TokenRelatedPhrase) this.f28494e;
            LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
            LessonPageViewModel lessonPageViewModelM10193t0 = this.f28495f.m10193t0();
            String str = tokenRelatedPhrase.f22111b;
            C5207g.m11111f(str, "phrase");
            C7570d c7570d = lessonPageViewModelM10193t0.f28528J;
            int i11 = c7570d != null ? c7570d.f41721a : -1;
            int i12 = c7570d != null ? c7570d.f41722b : -1;
            List listM14299s3 = C7076b.m14299s3(str, new String[]{" "}, 0, 6);
            ArrayList<C7570d> arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            C7567a c7567a = (C7567a) lessonPageViewModelM10193t0.f28531M.getValue();
            if (c7567a != null) {
                List<C7570d> list = c7567a.f41703c;
                Iterator it = list.iterator();
                int i13 = 0;
                int i14 = 0;
                loop0: while (it.hasNext()) {
                    Object next = it.next();
                    int i15 = i13 + 1;
                    Iterator it2 = it;
                    if (i13 < 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    C7570d c7570d2 = (C7570d) next;
                    if (i14 < listM14299s3.size()) {
                        String str2 = c7570d2.f41725e;
                        Locale locale = lessonPageViewModelM10193t0.f28530L;
                        C5207g.m11110e(locale, "locale");
                        if (C5207g.m11106a(C7793a.m15502f(str2, locale), C7793a.m15502f((String) listM14299s3.get(i14), locale))) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList.add(c7570d2);
                        sb2.append(c7570d2.f41725e);
                        sb2.append(" ");
                        i14++;
                    }
                    if (!z10 || i13 == list.size()) {
                        String string = sb2.toString();
                        C5207g.m11110e(string, "sequenceString.toString()");
                        int length = string.length() - 1;
                        int i16 = 0;
                        boolean z11 = false;
                        while (i16 <= length) {
                            boolean z12 = C5207g.m11113h(string.charAt(!z11 ? i16 : length), 32) <= 0;
                            if (z11) {
                                if (!z12) {
                                    break;
                                }
                                length--;
                            } else if (z12) {
                                i16++;
                            } else {
                                z11 = true;
                            }
                        }
                        if (C5207g.m11106a(string.subSequence(i16, length + 1).toString(), str)) {
                            for (C7570d c7570d3 : arrayList) {
                                if (c7570d3.f41721a == i11 && c7570d3.f41722b == i12) {
                                    C7570d c7570d4 = new C7570d(((C7570d) arrayList.get(0)).f41721a, ((C7570d) arrayList.get(arrayList.size() - 1)).f41722b, 0, 0, str, ((C7570d) arrayList.get(0)).f41726f, 0, 0, null, null, TextTokenType.POTENTIAL_PHRASE, 0, 15308);
                                    lessonPageViewModelM10193t0.m10198g();
                                    lessonPageViewModelM10193t0.f28546b0.setValue(lessonPageViewModelM10193t0.f28528J);
                                    lessonPageViewModelM10193t0.f28544Z.setValue(null);
                                    lessonPageViewModelM10193t0.f28559i0.setValue(LessonPageViewModel.m10197r2(c7570d4));
                                    break loop0;
                                }
                            }
                            i10 = 0;
                            sb2.delete(0, sb2.length());
                            arrayList.clear();
                        } else {
                            i10 = 0;
                            sb2.delete(0, sb2.length());
                            arrayList.clear();
                        }
                        i14 = i10;
                    } else {
                        i10 = 0;
                    }
                    it = it2;
                    i13 = i15;
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageFragment$onViewCreated$2$8(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super LessonPageFragment$onViewCreated$2$8> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28493f = lessonPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageFragment$onViewCreated$2$8(this.f28493f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageFragment$onViewCreated$2$8) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28492e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
            LessonPageFragment lessonPageFragment = this.f28493f;
            InterfaceC7137r<TokenRelatedPhrase> interfaceC7137rMo10036V = lessonPageFragment.m10192s0().mo10036V();
            C43681 c43681 = new C43681(lessonPageFragment, null);
            this.f28492e = 1;
            if (C0062b.m369m0(interfaceC7137rMo10036V, c43681, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
