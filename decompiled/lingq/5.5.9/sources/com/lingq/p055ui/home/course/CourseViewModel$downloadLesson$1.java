package com.lingq.p055ui.home.course;

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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$downloadLesson$1", m19206f = "CourseViewModel.kt", m19207l = {570, 570, 581, 589, 599}, m19208m = "invokeSuspend")
final class CourseViewModel$downloadLesson$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public CourseViewModel f24022e;

    /* JADX INFO: renamed from: f */
    public LessonInfo f24023f;

    /* JADX INFO: renamed from: g */
    public String f24024g;

    /* JADX INFO: renamed from: h */
    public int f24025h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ CourseViewModel f24026i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f24027j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseViewModel$downloadLesson$1(CourseViewModel courseViewModel, int i10, InterfaceC9968c<? super CourseViewModel$downloadLesson$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24026i = courseViewModel;
        this.f24027j = i10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CourseViewModel$downloadLesson$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CourseViewModel$downloadLesson$1(this.f24026i, this.f24027j, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:42:0x008e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:46:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x009a  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:67:0x010c  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        LessonInfo lessonInfo;
        LessonInfo lessonInfo2;
        String str;
        boolean z10;
        String str2;
        InterfaceC3324a interfaceC3324a;
        String strMo498E1;
        boolean z11;
        DownloadItem downloadItem;
        DownloadItem downloadItem2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24025h;
        int i11 = this.f24027j;
        CourseViewModel courseViewModel = this.f24026i;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else if (i10 == 2) {
                C7499b.m14977z0(obj);
                lessonInfo = (LessonInfo) obj;
                lessonInfo2 = lessonInfo;
                if (lessonInfo2 != null) {
                    str = lessonInfo2.f21968e;
                    if (str == null) {
                        z10 = false;
                    } else {
                        if (str.length() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    if (!z10) {
                        str = "";
                    }
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    interfaceC3324a = courseViewModel.f23949e;
                    strMo498E1 = courseViewModel.mo498E1();
                    this.f24022e = courseViewModel;
                    this.f24023f = lessonInfo2;
                    this.f24024g = str2;
                    this.f24025h = 3;
                    if (interfaceC3324a.mo9511d(lessonInfo2.f21964a, strMo498E1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (str2.length() == 0) {
                        downloadItem = new DownloadItem(courseViewModel.mo498E1(), lessonInfo2.f21964a, str2, false);
                        this.f24022e = null;
                        this.f24023f = null;
                        this.f24024g = null;
                        this.f24025h = 5;
                        if (courseViewModel.mo9405S1(downloadItem, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (lessonInfo2.f21963N == null) {
                        downloadItem2 = new DownloadItem(courseViewModel.mo498E1(), lessonInfo2.f21964a, str2, false);
                        this.f24022e = null;
                        this.f24023f = null;
                        this.f24024g = null;
                        this.f24025h = 4;
                        if (courseViewModel.mo9422x0(downloadItem2, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
            } else if (i10 == 3) {
                str2 = this.f24024g;
                lessonInfo2 = this.f24023f;
                courseViewModel = this.f24022e;
                C7499b.m14977z0(obj);
                if (str2.length() == 0) {
                    downloadItem = new DownloadItem(courseViewModel.mo498E1(), lessonInfo2.f21964a, str2, false);
                    this.f24022e = null;
                    this.f24023f = null;
                    this.f24024g = null;
                    this.f24025h = 5;
                    if (courseViewModel.mo9405S1(downloadItem, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (lessonInfo2.f21963N == null) {
                    downloadItem2 = new DownloadItem(courseViewModel.mo498E1(), lessonInfo2.f21964a, str2, false);
                    this.f24022e = null;
                    this.f24023f = null;
                    this.f24024g = null;
                    this.f24025h = 4;
                    if (courseViewModel.mo9422x0(downloadItem2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i10 != 4 && i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC3324a interfaceC3324a2 = courseViewModel.f23949e;
        this.f24025h = 1;
        obj = interfaceC3324a2.mo9505a(i11, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonInfo = (LessonInfo) obj;
        if (lessonInfo == null) {
            InterfaceC2014g interfaceC2014g = courseViewModel.f23951f;
            this.f24025h = 2;
            obj = interfaceC2014g.mo6055a(i11, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            lessonInfo = (LessonInfo) obj;
            lessonInfo2 = lessonInfo;
            if (lessonInfo2 != null) {
                str = lessonInfo2.f21968e;
                if (str == null) {
                    z10 = false;
                } else {
                    if (str.length() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (!z10) {
                    str = "";
                }
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                interfaceC3324a = courseViewModel.f23949e;
                strMo498E1 = courseViewModel.mo498E1();
                this.f24022e = courseViewModel;
                this.f24023f = lessonInfo2;
                this.f24024g = str2;
                this.f24025h = 3;
                if (interfaceC3324a.mo9511d(lessonInfo2.f21964a, strMo498E1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (str2.length() == 0) {
                    downloadItem = new DownloadItem(courseViewModel.mo498E1(), lessonInfo2.f21964a, str2, false);
                    this.f24022e = null;
                    this.f24023f = null;
                    this.f24024g = null;
                    this.f24025h = 5;
                    if (courseViewModel.mo9405S1(downloadItem, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (lessonInfo2.f21963N == null) {
                    downloadItem2 = new DownloadItem(courseViewModel.mo498E1(), lessonInfo2.f21964a, str2, false);
                    this.f24022e = null;
                    this.f24023f = null;
                    this.f24024g = null;
                    this.f24025h = 4;
                    if (courseViewModel.mo9422x0(downloadItem2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
        } else {
            lessonInfo2 = lessonInfo;
            if (lessonInfo2 != null) {
                str = lessonInfo2.f21968e;
                if (str == null) {
                    z10 = false;
                } else {
                    if (str.length() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (!z10) {
                    str = "";
                }
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                interfaceC3324a = courseViewModel.f23949e;
                strMo498E1 = courseViewModel.mo498E1();
                this.f24022e = courseViewModel;
                this.f24023f = lessonInfo2;
                this.f24024g = str2;
                this.f24025h = 3;
                if (interfaceC3324a.mo9511d(lessonInfo2.f21964a, strMo498E1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (str2.length() == 0) {
                    downloadItem = new DownloadItem(courseViewModel.mo498E1(), lessonInfo2.f21964a, str2, false);
                    this.f24022e = null;
                    this.f24023f = null;
                    this.f24024g = null;
                    this.f24025h = 5;
                    if (courseViewModel.mo9405S1(downloadItem, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (lessonInfo2.f21963N == null) {
                    downloadItem2 = new DownloadItem(courseViewModel.mo498E1(), lessonInfo2.f21964a, str2, false);
                    this.f24022e = null;
                    this.f24023f = null;
                    this.f24024g = null;
                    this.f24025h = 4;
                    if (courseViewModel.mo9422x0(downloadItem2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
        }
        return C9072e.f47360a;
    }
}
