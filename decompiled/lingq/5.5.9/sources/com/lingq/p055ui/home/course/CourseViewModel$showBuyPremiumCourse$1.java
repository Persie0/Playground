package com.lingq.p055ui.home.course;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import no.InterfaceC7882z;
import p181ii.C6332a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$showBuyPremiumCourse$1", m19206f = "CourseViewModel.kt", m19207l = {801, 803, 805}, m19208m = "invokeSuspend")
public final class CourseViewModel$showBuyPremiumCourse$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public CourseViewModel f24104e;

    /* JADX INFO: renamed from: f */
    public C6332a f24105f;

    /* JADX INFO: renamed from: g */
    public int f24106g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CourseViewModel f24107h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseViewModel$showBuyPremiumCourse$1(CourseViewModel courseViewModel, InterfaceC9968c<? super CourseViewModel$showBuyPremiumCourse$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24107h = courseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CourseViewModel$showBuyPremiumCourse$1(this.f24107h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CourseViewModel$showBuyPremiumCourse$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        C6332a c6332a;
        CourseViewModel courseViewModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24106g;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            } else {
                c6332a = this.f24105f;
                courseViewModel = this.f24104e;
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        CourseViewModel courseViewModel2 = this.f24107h;
        c6332a = (C6332a) courseViewModel2.f23938U.getValue();
        if (c6332a != null) {
            ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = courseViewModel2.f23953g.mo9619h();
            this.f24104e = courseViewModel2;
            this.f24105f = c6332a;
            this.f24106g = 1;
            Object objM14360a = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, this);
            if (objM14360a == coroutineSingletons) {
                return coroutineSingletons;
            }
            courseViewModel = courseViewModel2;
            obj = objM14360a;
        }
        return C9072e.f47360a;
        int i11 = ((Profile) obj).f17800t;
        int i12 = c6332a.f36594U;
        if (i11 < i12) {
            C7138s c7138s = courseViewModel.f23966n0;
            Triple triple = new Triple(new Integer(i12), new Integer(i11), Boolean.TRUE);
            this.f24104e = null;
            this.f24105f = null;
            this.f24106g = 2;
            if (c7138s.mo1339r(triple, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            C7138s c7138s2 = courseViewModel.f23960j0;
            Triple triple2 = new Triple(new Integer(i12), new Integer(i11), new Integer(c6332a.f36595a));
            this.f24104e = null;
            this.f24105f = null;
            this.f24106g = 3;
            if (c7138s2.mo1339r(triple2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }
}
