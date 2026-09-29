package com.lingq.p055ui.imports.userImport;

import cm.InterfaceC2058r;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.language.UserLanguage;
import dm.C5207g;
import fj.C5546g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, m13365d2 = {"", "lessonId", "Lcom/lingq/shared/uimodel/language/UserLanguage;", "activeLanguage", "Lfj/g;", "importData", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportViewModel$openLessonWithId$1", m19206f = "UserImportViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class UserImportViewModel$openLessonWithId$1 extends SuspendLambda implements InterfaceC2058r<Integer, UserLanguage, C5546g, InterfaceC9968c<? super Integer>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Integer f26833e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ UserLanguage f26834f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ C5546g f26835g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ UserImportViewModel f26836h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportViewModel$openLessonWithId$1(UserImportViewModel userImportViewModel, InterfaceC9968c<? super UserImportViewModel$openLessonWithId$1> interfaceC9968c) {
        super(4, interfaceC9968c);
        this.f26836h = userImportViewModel;
    }

    @Override // cm.InterfaceC2058r
    /* JADX INFO: renamed from: T */
    public final Object mo1851T(Integer num, UserLanguage userLanguage, C5546g c5546g, InterfaceC9968c<? super Integer> interfaceC9968c) {
        UserImportViewModel$openLessonWithId$1 userImportViewModel$openLessonWithId$1 = new UserImportViewModel$openLessonWithId$1(this.f26836h, interfaceC9968c);
        userImportViewModel$openLessonWithId$1.f26833e = num;
        userImportViewModel$openLessonWithId$1.f26834f = userLanguage;
        userImportViewModel$openLessonWithId$1.f26835g = c5546g;
        return userImportViewModel$openLessonWithId$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        Integer num = this.f26833e;
        UserLanguage userLanguage = this.f26834f;
        C5546g c5546g = this.f26835g;
        if (num == null || num.intValue() != -1) {
            if (C5207g.m11106a(userLanguage != null ? userLanguage.f21726a : null, c5546g.f34280a)) {
                this.f26836h.f26795I.setValue(Resource.Status.SUCCESS);
                return num;
            }
        }
        return null;
    }
}
