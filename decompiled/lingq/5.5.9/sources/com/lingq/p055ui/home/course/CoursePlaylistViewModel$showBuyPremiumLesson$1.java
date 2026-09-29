package com.lingq.p055ui.home.course;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1;
import java.util.Iterator;
import ki.C6697c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$showBuyPremiumLesson$1", m19206f = "CoursePlaylistViewModel.kt", m19207l = {314, 317, 319}, m19208m = "invokeSuspend")
public final class CoursePlaylistViewModel$showBuyPremiumLesson$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23919e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CoursePlaylistViewModel f23920f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23921g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoursePlaylistViewModel$showBuyPremiumLesson$1(CoursePlaylistViewModel coursePlaylistViewModel, int i10, InterfaceC9968c<? super CoursePlaylistViewModel$showBuyPremiumLesson$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23920f = coursePlaylistViewModel;
        this.f23921g = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CoursePlaylistViewModel$showBuyPremiumLesson$1(this.f23920f, this.f23921g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CoursePlaylistViewModel$showBuyPremiumLesson$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        int i10;
        int i11;
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = this.f23919e;
        CoursePlaylistViewModel coursePlaylistViewModel = this.f23920f;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            } else {
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = coursePlaylistViewModel.f23845g.mo9619h();
        this.f23919e = 1;
        obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        int i13 = ((Profile) obj).f17800t;
        Iterator it = ((Iterable) coursePlaylistViewModel.f23827P.getValue()).iterator();
        do {
            boolean zHasNext = it.hasNext();
            i10 = 0;
            i11 = this.f23921g;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((C6697c) next).f37856a == i11));
        C6697c c6697c = (C6697c) next;
        if (c6697c != null) {
            i10 = c6697c.f37874s;
        }
        if (i13 < i10) {
            C7138s c7138s = coursePlaylistViewModel.f23840c0;
            Pair pair = new Pair(new Integer(i10), new Integer(i13));
            this.f23919e = 2;
            if (c7138s.mo1339r(pair, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            C7138s c7138s2 = coursePlaylistViewModel.f23839b0;
            Triple triple = new Triple(new Integer(i10), new Integer(i13), new Integer(i11));
            this.f23919e = 3;
            if (c7138s2.mo1339r(triple, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }
}
