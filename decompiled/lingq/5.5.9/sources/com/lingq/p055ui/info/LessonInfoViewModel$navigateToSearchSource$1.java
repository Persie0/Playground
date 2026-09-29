package com.lingq.p055ui.info;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.ContentType;
import com.lingq.shared.uimodel.library.LessonInfo;
import com.lingq.shared.uimodel.library.LibrarySearchQuery;
import com.lingq.shared.uimodel.library.LibraryShelfType;
import com.lingq.shared.uimodel.library.Sort;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import ni.C7793a;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoViewModel$navigateToSearchSource$1", m19206f = "LessonInfoViewModel.kt", m19207l = {486, 493, 496}, m19208m = "invokeSuspend")
final class LessonInfoViewModel$navigateToSearchSource$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public LessonInfoViewModel f27018e;

    /* JADX INFO: renamed from: f */
    public String f27019f;

    /* JADX INFO: renamed from: g */
    public LibrarySearchQuery f27020g;

    /* JADX INFO: renamed from: h */
    public int f27021h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ LessonInfoViewModel f27022i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f27023j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$navigateToSearchSource$1(LessonInfoViewModel lessonInfoViewModel, String str, InterfaceC9968c<? super LessonInfoViewModel$navigateToSearchSource$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27022i = lessonInfoViewModel;
        this.f27023j = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonInfoViewModel$navigateToSearchSource$1(this.f27022i, this.f27023j, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonInfoViewModel$navigateToSearchSource$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00e5  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object objM14360a;
        LessonInfoViewModel lessonInfoViewModel;
        String str;
        Object objM14360a2;
        LibrarySearchQuery librarySearchQuery;
        LessonInfoViewModel lessonInfoViewModel2;
        LinkedHashMap linkedHashMapM13467T0;
        String str2;
        LessonInfoViewModel lessonInfoViewModel3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27021h;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonInfoViewModel lessonInfoViewModel4 = this.f27022i;
            if (((LessonInfo) lessonInfoViewModel4.f26922J.getValue()) != null) {
                InterfaceC7116c<Map<String, LibrarySearchQuery>> interfaceC7116cMo9688l = lessonInfoViewModel4.f26950h.mo9688l();
                this.f27018e = lessonInfoViewModel4;
                String str3 = this.f27023j;
                this.f27019f = str3;
                this.f27021h = 1;
                objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9688l, this);
                if (objM14360a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lessonInfoViewModel = lessonInfoViewModel4;
                str = str3;
            }
            return C9072e.f47360a;
        }
        if (i10 == 1) {
            str = this.f27019f;
            LessonInfoViewModel lessonInfoViewModel5 = this.f27018e;
            C7499b.m14977z0(obj);
            lessonInfoViewModel = lessonInfoViewModel5;
            objM14360a = obj;
        } else if (i10 == 2) {
            LibrarySearchQuery librarySearchQuery2 = this.f27020g;
            String str4 = this.f27019f;
            lessonInfoViewModel2 = this.f27018e;
            C7499b.m14977z0(obj);
            librarySearchQuery = librarySearchQuery2;
            str = str4;
            objM14360a2 = obj;
            linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a2);
            linkedHashMapM13467T0.put(C7793a.m15498b(lessonInfoViewModel2.mo498E1(), LibraryShelfType.SourceSearch.getValue()), librarySearchQuery);
            this.f27018e = lessonInfoViewModel2;
            this.f27019f = str;
            this.f27020g = null;
            this.f27021h = 3;
            if (lessonInfoViewModel2.f26950h.mo9696t(linkedHashMapM13467T0, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            str2 = str;
            lessonInfoViewModel3 = lessonInfoViewModel2;
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = this.f27019f;
            lessonInfoViewModel3 = this.f27018e;
            C7499b.m14977z0(obj);
        }
        lessonInfoViewModel3.f26934V.mo16479j(new AbstractC4161d.d(str2));
        return C9072e.f47360a;
        LibrarySearchQuery librarySearchQuery3 = (LibrarySearchQuery) ((Map) objM14360a).get(C7793a.m15498b(lessonInfoViewModel.mo498E1(), LibraryShelfType.SourceSearch.getValue()));
        if (librarySearchQuery3 == null) {
            librarySearchQuery3 = new LibrarySearchQuery(null, null, 0, Sort.Newest, false, false, false, null, null, null, null, null, 4087, null);
        }
        librarySearchQuery3.f22032i = ContentType.External;
        InterfaceC7116c<Map<String, LibrarySearchQuery>> interfaceC7116cMo9688l2 = lessonInfoViewModel.f26950h.mo9688l();
        this.f27018e = lessonInfoViewModel;
        this.f27019f = str;
        this.f27020g = librarySearchQuery3;
        this.f27021h = 2;
        objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9688l2, this);
        if (objM14360a2 == coroutineSingletons) {
            return coroutineSingletons;
        }
        LessonInfoViewModel lessonInfoViewModel6 = lessonInfoViewModel;
        librarySearchQuery = librarySearchQuery3;
        lessonInfoViewModel2 = lessonInfoViewModel6;
        linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a2);
        linkedHashMapM13467T0.put(C7793a.m15498b(lessonInfoViewModel2.mo498E1(), LibraryShelfType.SourceSearch.getValue()), librarySearchQuery);
        this.f27018e = lessonInfoViewModel2;
        this.f27019f = str;
        this.f27020g = null;
        this.f27021h = 3;
        if (lessonInfoViewModel2.f26950h.mo9696t(linkedHashMapM13467T0, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        str2 = str;
        lessonInfoViewModel3 = lessonInfoViewModel2;
        lessonInfoViewModel3.f26934V.mo16479j(new AbstractC4161d.d(str2));
        return C9072e.f47360a;
    }
}
