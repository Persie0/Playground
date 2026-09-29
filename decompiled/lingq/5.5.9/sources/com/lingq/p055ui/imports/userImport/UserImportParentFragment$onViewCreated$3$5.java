package com.lingq.p055ui.imports.userImport;

import ae.C0062b;
import android.os.Bundle;
import androidx.fragment.app.C0987y;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import fj.C5553n;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7137r;
import mo.C7661i;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportParentFragment$onViewCreated$3$5", m19206f = "UserImportParentFragment.kt", m19207l = {119}, m19208m = "invokeSuspend")
public final class UserImportParentFragment$onViewCreated$3$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26667e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ UserImportParentFragment f26668f;

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportParentFragment$onViewCreated$3$5$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "lessonId", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportParentFragment$onViewCreated$3$5$1", m19206f = "UserImportParentFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41011 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ int f26669e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ UserImportParentFragment f26670f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41011(UserImportParentFragment userImportParentFragment, InterfaceC9968c<? super C41011> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26670f = userImportParentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41011 c41011 = new C41011(this.f26670f, interfaceC9968c);
            c41011.f26669e = ((Number) obj).intValue();
            return c41011;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41011) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            int i10 = this.f26669e;
            Bundle bundle = new Bundle();
            bundle.putInt("lessonImportedId", i10);
            InterfaceC6727j<Object>[] interfaceC6727jArr = UserImportParentFragment.f26640T0;
            UserImportParentFragment userImportParentFragment = this.f26670f;
            if (C7661i.m15250P2(((C5553n) userImportParentFragment.f26643S0.getValue()).f34308b)) {
                C0987y.m3824f(bundle, userImportParentFragment, "lessonImportedFromUser");
            } else {
                C0987y.m3824f(bundle, userImportParentFragment, "lessonImportedFromWeb");
            }
            C8573r0.m16725g0(userImportParentFragment).m3995p();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportParentFragment$onViewCreated$3$5(UserImportParentFragment userImportParentFragment, InterfaceC9968c<? super UserImportParentFragment$onViewCreated$3$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26668f = userImportParentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new UserImportParentFragment$onViewCreated$3$5(this.f26668f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((UserImportParentFragment$onViewCreated$3$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26667e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            UserImportParentFragment userImportParentFragment = this.f26668f;
            InterfaceC7137r<Integer> interfaceC7137rMo10076F = UserImportParentFragment.m10091u0(userImportParentFragment).mo10076F();
            C41011 c41011 = new C41011(userImportParentFragment, null);
            this.f26667e = 1;
            if (C0062b.m369m0(interfaceC7137rMo10076F, c41011, this) == coroutineSingletons) {
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
