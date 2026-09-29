package com.lingq.p055ui.home.course;

import androidx.datastore.preferences.PreferencesProto$Value;
import ci.InterfaceC2014g;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import p076di.InterfaceC5180b;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$buyCourse$1", m19206f = "CourseViewModel.kt", m19207l = {830, 831, 833, 835, 838, 843}, m19208m = "invokeSuspend")
final class CourseViewModel$buyCourse$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public boolean f24007e;

    /* JADX INFO: renamed from: f */
    public int f24008f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CourseViewModel f24009g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f24010h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f24011i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseViewModel$buyCourse$1(CourseViewModel courseViewModel, int i10, int i11, InterfaceC9968c<? super CourseViewModel$buyCourse$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24009g = courseViewModel;
        this.f24010h = i10;
        this.f24011i = i11;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CourseViewModel$buyCourse$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CourseViewModel$buyCourse$1(this.f24009g, this.f24010h, this.f24011i, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083 A[Catch: Exception -> 0x00cd, TryCatch #0 {Exception -> 0x00cd, blocks: (B:7:0x001c, B:42:0x00c4, B:8:0x0022, B:38:0x00b1, B:9:0x0028, B:34:0x0098, B:12:0x0030, B:29:0x0083, B:13:0x0035, B:20:0x005a, B:24:0x006b, B:16:0x003d), top: B:49:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0095  */
    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        boolean zBooleanValue;
        C7138s c7138s;
        Boolean boolValueOf;
        Profile profile;
        InterfaceC5180b interfaceC5180b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24008f;
        boolean z10 = true;
        CourseViewModel courseViewModel = this.f24009g;
        try {
            switch (i10) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    C7499b.m14977z0(obj);
                    courseViewModel.f23931N.setValue(Boolean.TRUE);
                    InterfaceC2014g interfaceC2014g = courseViewModel.f23951f;
                    int i11 = this.f24010h;
                    String strMo498E1 = courseViewModel.mo498E1();
                    this.f24008f = 1;
                    obj = interfaceC2014g.mo6060f(i11, strMo498E1, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    c7138s = courseViewModel.f23970r0;
                    if (zBooleanValue) {
                        z10 = false;
                    }
                    boolValueOf = Boolean.valueOf(z10);
                    this.f24007e = zBooleanValue;
                    this.f24008f = 2;
                    if (c7138s.mo1339r(boolValueOf, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (zBooleanValue) {
                        ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = courseViewModel.f23953g.mo9619h();
                        this.f24008f = 3;
                        obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        profile = (Profile) obj;
                        profile.f17800t -= this.f24011i;
                        interfaceC5180b = courseViewModel.f23953g;
                        this.f24008f = 4;
                        if (interfaceC5180b.mo9620i(profile, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        CourseViewModel.m9890l2(courseViewModel);
                        courseViewModel.m9892n2();
                        this.f24008f = 5;
                        if (courseViewModel.mo503f1(this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    courseViewModel.f23931N.setValue(Boolean.FALSE);
                    return C9072e.f47360a;
                case 1:
                    C7499b.m14977z0(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    c7138s = courseViewModel.f23970r0;
                    if (zBooleanValue) {
                        z10 = false;
                    }
                    boolValueOf = Boolean.valueOf(z10);
                    this.f24007e = zBooleanValue;
                    this.f24008f = 2;
                    if (c7138s.mo1339r(boolValueOf, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (zBooleanValue) {
                        ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h2 = courseViewModel.f23953g.mo9619h();
                        this.f24008f = 3;
                        obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h2, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        profile = (Profile) obj;
                        profile.f17800t -= this.f24011i;
                        interfaceC5180b = courseViewModel.f23953g;
                        this.f24008f = 4;
                        if (interfaceC5180b.mo9620i(profile, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        CourseViewModel.m9890l2(courseViewModel);
                        courseViewModel.m9892n2();
                        this.f24008f = 5;
                        if (courseViewModel.mo503f1(this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    courseViewModel.f23931N.setValue(Boolean.FALSE);
                    return C9072e.f47360a;
                case 2:
                    zBooleanValue = this.f24007e;
                    C7499b.m14977z0(obj);
                    if (zBooleanValue) {
                        ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h3 = courseViewModel.f23953g.mo9619h();
                        this.f24008f = 3;
                        obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h3, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        profile = (Profile) obj;
                        profile.f17800t -= this.f24011i;
                        interfaceC5180b = courseViewModel.f23953g;
                        this.f24008f = 4;
                        if (interfaceC5180b.mo9620i(profile, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        CourseViewModel.m9890l2(courseViewModel);
                        courseViewModel.m9892n2();
                        this.f24008f = 5;
                        if (courseViewModel.mo503f1(this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    courseViewModel.f23931N.setValue(Boolean.FALSE);
                    return C9072e.f47360a;
                case 3:
                    C7499b.m14977z0(obj);
                    profile = (Profile) obj;
                    profile.f17800t -= this.f24011i;
                    interfaceC5180b = courseViewModel.f23953g;
                    this.f24008f = 4;
                    if (interfaceC5180b.mo9620i(profile, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    CourseViewModel.m9890l2(courseViewModel);
                    courseViewModel.m9892n2();
                    this.f24008f = 5;
                    if (courseViewModel.mo503f1(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    courseViewModel.f23931N.setValue(Boolean.FALSE);
                    return C9072e.f47360a;
                case 4:
                    C7499b.m14977z0(obj);
                    CourseViewModel.m9890l2(courseViewModel);
                    courseViewModel.m9892n2();
                    this.f24008f = 5;
                    if (courseViewModel.mo503f1(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    courseViewModel.f23931N.setValue(Boolean.FALSE);
                    return C9072e.f47360a;
                case 5:
                    C7499b.m14977z0(obj);
                    courseViewModel.f23931N.setValue(Boolean.FALSE);
                    return C9072e.f47360a;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    C7499b.m14977z0(obj);
                    return C9072e.f47360a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception unused) {
            StateFlowImpl stateFlowImpl = courseViewModel.f23931N;
            Boolean bool = Boolean.FALSE;
            stateFlowImpl.setValue(bool);
            C7138s c7138s2 = courseViewModel.f23970r0;
            this.f24008f = 6;
            if (c7138s2.mo1339r(bool, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
    }
}
