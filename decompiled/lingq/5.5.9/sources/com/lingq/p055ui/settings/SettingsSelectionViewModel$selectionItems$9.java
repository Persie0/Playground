package com.lingq.p055ui.settings;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.shared.storage.C3398a;
import com.lingq.shared.storage.LessonFont;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p278nh.AbstractC7789p;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\"\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u008a@"}, m13365d2 = {"", "", "Lcom/lingq/shared/storage/LessonFont;", "lessonFont", "Lkotlin/Pair;", "", "downloadingFont", "", "Lnh/p$a;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.settings.SettingsSelectionViewModel$selectionItems$9", m19206f = "SettingsSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class SettingsSelectionViewModel$selectionItems$9 extends SuspendLambda implements InterfaceC2057q<Map<String, ? extends LessonFont>, Pair<? extends LessonFont, ? extends Integer>, InterfaceC9968c<? super List<? extends AbstractC7789p.a>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Map f31140e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Pair f31141f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SettingsSelectionViewModel f31142g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsSelectionViewModel$selectionItems$9(SettingsSelectionViewModel settingsSelectionViewModel, InterfaceC9968c<? super SettingsSelectionViewModel$selectionItems$9> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f31142g = settingsSelectionViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(Map<String, ? extends LessonFont> map, Pair<? extends LessonFont, ? extends Integer> pair, InterfaceC9968c<? super List<? extends AbstractC7789p.a>> interfaceC9968c) {
        SettingsSelectionViewModel$selectionItems$9 settingsSelectionViewModel$selectionItems$9 = new SettingsSelectionViewModel$selectionItems$9(this.f31142g, interfaceC9968c);
        settingsSelectionViewModel$selectionItems$9.f31140e = map;
        settingsSelectionViewModel$selectionItems$9.f31141f = pair;
        return settingsSelectionViewModel$selectionItems$9.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        Map map = this.f31140e;
        Pair pair = this.f31141f;
        LessonFont.Companion companion = LessonFont.INSTANCE;
        SettingsSelectionViewModel settingsSelectionViewModel = this.f31142g;
        String strMo498E1 = settingsSelectionViewModel.mo498E1();
        companion.getClass();
        ArrayList<LessonFont> arrayListM9553c = LessonFont.Companion.m9553c(strMo498E1);
        ArrayList arrayList = new ArrayList(C9325m.m17681z(arrayListM9553c, 10));
        for (LessonFont lessonFont : arrayListM9553c) {
            arrayList.add(new AbstractC7789p.a(ViewKeys.LessonFont.ordinal(), (!C5207g.m11106a(pair != null ? (LessonFont) pair.f38012a : null, lessonFont) || ((Number) pair.f38013b).intValue() < 0) ? 0 : ((Number) pair.f38013b).intValue(), lessonFont.getTitle(), C3398a.m9700c(lessonFont), C5207g.m11106a(map.get(settingsSelectionViewModel.mo498E1()), lessonFont)));
        }
        return arrayList;
    }
}
