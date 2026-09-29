package com.lingq.p055ui.home.collections;

import ci.InterfaceC2014g;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.download.DownloadItem;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.library.LessonInfo;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$downloadLesson$1", m19206f = "CollectionsViewModel.kt", m19207l = {582, 582, 594}, m19208m = "invokeSuspend")
final class CollectionsViewModel$downloadLesson$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public CollectionsViewModel f23323e;

    /* JADX INFO: renamed from: f */
    public LessonInfo f23324f;

    /* JADX INFO: renamed from: g */
    public String f23325g;

    /* JADX INFO: renamed from: h */
    public int f23326h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ CollectionsViewModel f23327i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f23328j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsViewModel$downloadLesson$1(CollectionsViewModel collectionsViewModel, int i10, InterfaceC9968c<? super CollectionsViewModel$downloadLesson$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f23327i = collectionsViewModel;
        this.f23328j = i10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsViewModel$downloadLesson$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsViewModel$downloadLesson$1(this.f23327i, this.f23328j, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x007b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        LessonInfo lessonInfo;
        LessonInfo lessonInfo2;
        String str;
        InterfaceC3324a interfaceC3324a;
        String strMo498E1;
        String str2;
        boolean z10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23326h;
        int i11 = this.f23328j;
        CollectionsViewModel collectionsViewModel = this.f23327i;
        boolean z11 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 == 2) {
                    C7499b.m14977z0(obj);
                    lessonInfo = (LessonInfo) obj;
                    lessonInfo2 = lessonInfo;
                    if (lessonInfo2 != null) {
                        str = lessonInfo2.f21968e;
                        if (str == null) {
                            z11 = false;
                        } else {
                            if (str.length() > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                z11 = false;
                            }
                        }
                        if (!z11) {
                            str = "";
                        }
                        if (str == null) {
                            str = "";
                        }
                        interfaceC3324a = collectionsViewModel.f23247d;
                        strMo498E1 = collectionsViewModel.mo498E1();
                        this.f23323e = collectionsViewModel;
                        this.f23324f = lessonInfo2;
                        this.f23325g = str;
                        this.f23326h = 3;
                        if (interfaceC3324a.mo9511d(lessonInfo2.f21964a, strMo498E1, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str2 = str;
                    }
                    return C9072e.f47360a;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = this.f23325g;
                lessonInfo2 = this.f23324f;
                collectionsViewModel = this.f23323e;
                C7499b.m14977z0(obj);
            }
            collectionsViewModel.f23226I.mo9406X0(new DownloadItem(collectionsViewModel.mo498E1(), lessonInfo2.f21964a, str2, false), false);
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC3324a interfaceC3324a2 = collectionsViewModel.f23247d;
        this.f23326h = 1;
        obj = interfaceC3324a2.mo9505a(i11, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonInfo = (LessonInfo) obj;
        if (lessonInfo == null) {
            InterfaceC2014g interfaceC2014g = collectionsViewModel.f23251f;
            this.f23326h = 2;
            obj = interfaceC2014g.mo6055a(i11, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            lessonInfo = (LessonInfo) obj;
            lessonInfo2 = lessonInfo;
            if (lessonInfo2 != null) {
                str = lessonInfo2.f21968e;
                if (str == null) {
                    z11 = false;
                } else {
                    if (str.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        z11 = false;
                    }
                }
                if (!z11) {
                    str = "";
                }
                if (str == null) {
                    str = "";
                }
                interfaceC3324a = collectionsViewModel.f23247d;
                strMo498E1 = collectionsViewModel.mo498E1();
                this.f23323e = collectionsViewModel;
                this.f23324f = lessonInfo2;
                this.f23325g = str;
                this.f23326h = 3;
                if (interfaceC3324a.mo9511d(lessonInfo2.f21964a, strMo498E1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str2 = str;
                collectionsViewModel.f23226I.mo9406X0(new DownloadItem(collectionsViewModel.mo498E1(), lessonInfo2.f21964a, str2, false), false);
            }
        } else {
            lessonInfo2 = lessonInfo;
            if (lessonInfo2 != null) {
                str = lessonInfo2.f21968e;
                if (str == null) {
                    z11 = false;
                } else {
                    if (str.length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        z11 = false;
                    }
                }
                if (!z11) {
                    str = "";
                }
                if (str == null) {
                    str = "";
                }
                interfaceC3324a = collectionsViewModel.f23247d;
                strMo498E1 = collectionsViewModel.mo498E1();
                this.f23323e = collectionsViewModel;
                this.f23324f = lessonInfo2;
                this.f23325g = str;
                this.f23326h = 3;
                if (interfaceC3324a.mo9511d(lessonInfo2.f21964a, strMo498E1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str2 = str;
                collectionsViewModel.f23226I.mo9406X0(new DownloadItem(collectionsViewModel.mo498E1(), lessonInfo2.f21964a, str2, false), false);
            }
        }
        return C9072e.f47360a;
    }
}
