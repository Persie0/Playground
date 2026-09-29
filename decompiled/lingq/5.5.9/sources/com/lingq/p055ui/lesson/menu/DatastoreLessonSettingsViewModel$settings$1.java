package com.lingq.p055ui.lesson.menu;

import cm.InterfaceC2059s;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p278nh.AbstractC7787n;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lnh/n;", "lessonSettings", "localeSettings", "fontSettings", "asianScriptSettings", "", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$settings$1", m19206f = "DatastoreLessonSettingsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class DatastoreLessonSettingsViewModel$settings$1 extends SuspendLambda implements InterfaceC2059s<List<? extends AbstractC7787n>, List<? extends AbstractC7787n>, List<? extends AbstractC7787n>, List<? extends AbstractC7787n>, InterfaceC9968c<? super List<AbstractC7787n>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f28252e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ List f28253f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ List f28254g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ List f28255h;

    public DatastoreLessonSettingsViewModel$settings$1(InterfaceC9968c<? super DatastoreLessonSettingsViewModel$settings$1> interfaceC9968c) {
        super(5, interfaceC9968c);
    }

    @Override // cm.InterfaceC2059s
    /* JADX INFO: renamed from: o0 */
    public final Object mo1501o0(List<? extends AbstractC7787n> list, List<? extends AbstractC7787n> list2, List<? extends AbstractC7787n> list3, List<? extends AbstractC7787n> list4, InterfaceC9968c<? super List<AbstractC7787n>> interfaceC9968c) {
        DatastoreLessonSettingsViewModel$settings$1 datastoreLessonSettingsViewModel$settings$1 = new DatastoreLessonSettingsViewModel$settings$1(interfaceC9968c);
        datastoreLessonSettingsViewModel$settings$1.f28252e = list;
        datastoreLessonSettingsViewModel$settings$1.f28253f = list2;
        datastoreLessonSettingsViewModel$settings$1.f28254g = list3;
        datastoreLessonSettingsViewModel$settings$1.f28255h = list4;
        return datastoreLessonSettingsViewModel$settings$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        List list = this.f28252e;
        List list2 = this.f28253f;
        List list3 = this.f28254g;
        List list4 = this.f28255h;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list3);
        arrayList.addAll(list);
        arrayList.addAll(list2);
        arrayList.addAll(list4);
        return arrayList;
    }
}
