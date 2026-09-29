package com.lingq.p055ui.settings;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.ViewKeys;
import com.linguist.R;
import dm.C5207g;
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
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lnh/p$b;", "", "japaneseScript", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.settings.SettingsSelectionViewModel$selectionItems$6", m19206f = "SettingsSelectionViewModel.kt", m19207l = {325}, m19208m = "invokeSuspend")
final class SettingsSelectionViewModel$selectionItems$6 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends AbstractC7789p.b>>, String, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31126e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f31127f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ String f31128g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SettingsSelectionViewModel f31129h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsSelectionViewModel$selectionItems$6(SettingsSelectionViewModel settingsSelectionViewModel, InterfaceC9968c<? super SettingsSelectionViewModel$selectionItems$6> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f31129h = settingsSelectionViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super List<? extends AbstractC7789p.b>> interfaceC7117d, String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        SettingsSelectionViewModel$selectionItems$6 settingsSelectionViewModel$selectionItems$6 = new SettingsSelectionViewModel$selectionItems$6(this.f31129h, interfaceC9968c);
        settingsSelectionViewModel$selectionItems$6.f31127f = interfaceC7117d;
        settingsSelectionViewModel$selectionItems$6.f31128g = str;
        return settingsSelectionViewModel$selectionItems$6.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31126e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f31127f;
            String str = this.f31128g;
            SettingsSelectionViewModel settingsSelectionViewModel = this.f31129h;
            String[] stringArray = settingsSelectionViewModel.f31077k.getResources().getStringArray(R.array.pref_lesson_asian_japanese_entries);
            C5207g.m11110e(stringArray, "applicationContext.resou…n_asian_japanese_entries)");
            String[] stringArray2 = settingsSelectionViewModel.f31077k.getResources().getStringArray(R.array.pref_lesson_asian_japanese_values);
            C5207g.m11110e(stringArray2, "applicationContext.resou…on_asian_japanese_values)");
            ArrayList arrayList = new ArrayList(stringArray.length);
            int length = stringArray.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                String str2 = stringArray[i11];
                int iOrdinal = ViewKeys.JapaneseType.ordinal();
                C5207g.m11110e(str2, "entry");
                String str3 = stringArray2[i12];
                C5207g.m11110e(str3, "values[index]");
                arrayList.add(new AbstractC7789p.b(iOrdinal, str2, str3, C5207g.m11106a(str, stringArray2[i12])));
                i11++;
                i12++;
            }
            this.f31127f = null;
            this.f31126e = 1;
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
