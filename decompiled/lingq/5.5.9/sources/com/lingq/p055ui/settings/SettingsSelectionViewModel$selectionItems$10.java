package com.lingq.p055ui.settings;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.shared.storage.Theme;
import com.lingq.util.C4924a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p278nh.AbstractC7789p;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lnh/p$b;", "Lcom/lingq/shared/storage/Theme;", "lessonFont", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.settings.SettingsSelectionViewModel$selectionItems$10", m19206f = "SettingsSelectionViewModel.kt", m19207l = {411}, m19208m = "invokeSuspend")
final class SettingsSelectionViewModel$selectionItems$10 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends AbstractC7789p.b>>, Theme, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31101e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f31102f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Theme f31103g;

    public SettingsSelectionViewModel$selectionItems$10(InterfaceC9968c<? super SettingsSelectionViewModel$selectionItems$10> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super List<? extends AbstractC7789p.b>> interfaceC7117d, Theme theme, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        SettingsSelectionViewModel$selectionItems$10 settingsSelectionViewModel$selectionItems$10 = new SettingsSelectionViewModel$selectionItems$10(interfaceC9968c);
        settingsSelectionViewModel$selectionItems$10.f31102f = interfaceC7117d;
        settingsSelectionViewModel$selectionItems$10.f31103g = theme;
        return settingsSelectionViewModel$selectionItems$10.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31101e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f31102f;
            Theme theme = this.f31103g;
            Theme[] themeArrValues = Theme.values();
            ArrayList arrayList = new ArrayList(themeArrValues.length);
            int length = themeArrValues.length;
            for (int i11 = 0; i11 < length; i11++) {
                Theme theme2 = themeArrValues[i11];
                arrayList.add(new AbstractC7789p.b(ViewKeys.Theme.ordinal(), C4924a.m10461g0(theme2), "", theme2.name(), theme == theme2));
            }
            this.f31102f = null;
            this.f31101e = 1;
            if (interfaceC7117d.mo1339r(arrayList, this) == coroutineSingletons) {
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
