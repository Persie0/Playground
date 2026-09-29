package com.lingq.p055ui.home.library;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserLanguageStudyStats;
import dm.C5207g;
import gi.C5804b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguageStudyStats;", "streak", "Lkotlin/Pair;", "Lgi/b;", "", "userStreak", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$showRepairStreak$1", m19206f = "LibraryViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class LibraryViewModel$showRepairStreak$1 extends SuspendLambda implements InterfaceC2057q<UserLanguageStudyStats, Pair<? extends C5804b, ? extends String>, InterfaceC9968c<? super Pair<? extends C5804b, ? extends UserLanguageStudyStats>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ UserLanguageStudyStats f24908e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Pair f24909f;

    public LibraryViewModel$showRepairStreak$1(InterfaceC9968c<? super LibraryViewModel$showRepairStreak$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(UserLanguageStudyStats userLanguageStudyStats, Pair<? extends C5804b, ? extends String> pair, InterfaceC9968c<? super Pair<? extends C5804b, ? extends UserLanguageStudyStats>> interfaceC9968c) {
        LibraryViewModel$showRepairStreak$1 libraryViewModel$showRepairStreak$1 = new LibraryViewModel$showRepairStreak$1(interfaceC9968c);
        libraryViewModel$showRepairStreak$1.f24908e = userLanguageStudyStats;
        libraryViewModel$showRepairStreak$1.f24909f = pair;
        return libraryViewModel$showRepairStreak$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        UserLanguageStudyStats userLanguageStudyStats = this.f24908e;
        Pair pair = this.f24909f;
        if (userLanguageStudyStats == null || pair == null || !C5207g.m11106a(userLanguageStudyStats.f21786a, pair.f38013b)) {
            return null;
        }
        return new Pair(pair.f38012a, userLanguageStudyStats);
    }
}
