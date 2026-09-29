package com.lingq.p055ui.imports.userImport;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.UserImportDetailType;
import dm.C5207g;
import fj.C5546g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportAddCourseViewModel$updateCourseName$1", m19206f = "UserImportAddCourseViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class UserImportAddCourseViewModel$updateCourseName$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ UserImportAddCourseViewModel f26577e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f26578f;

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportAddCourseViewModel$updateCourseName$1$a */
    public /* synthetic */ class C4085a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26579a;

        static {
            int[] iArr = new int[UserImportDetailType.values().length];
            try {
                iArr[UserImportDetailType.Course.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f26579a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportAddCourseViewModel$updateCourseName$1(UserImportAddCourseViewModel userImportAddCourseViewModel, String str, InterfaceC9968c<? super UserImportAddCourseViewModel$updateCourseName$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26577e = userImportAddCourseViewModel;
        this.f26578f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new UserImportAddCourseViewModel$updateCourseName$1(this.f26577e, this.f26578f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((UserImportAddCourseViewModel$updateCourseName$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        UserImportAddCourseViewModel userImportAddCourseViewModel = this.f26577e;
        C5546g value = userImportAddCourseViewModel.mo10080T1().getValue();
        if (C4085a.f26579a[userImportAddCourseViewModel.f26576f.ordinal()] == 1) {
            value.getClass();
            String str = this.f26578f;
            C5207g.m11111f(str, "<set-?>");
            value.f34282c = str;
            userImportAddCourseViewModel.f26575e.mo10085v0(value);
        }
        return C9072e.f47360a;
    }
}
