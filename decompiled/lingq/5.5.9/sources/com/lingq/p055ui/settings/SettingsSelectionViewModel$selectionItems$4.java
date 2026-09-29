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
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lnh/p$b;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.settings.SettingsSelectionViewModel$selectionItems$4", m19206f = "SettingsSelectionViewModel.kt", m19207l = {289}, m19208m = "invokeSuspend")
final class SettingsSelectionViewModel$selectionItems$4 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends AbstractC7789p.b>>, String, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31120e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f31121f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SettingsSelectionViewModel f31122g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsSelectionViewModel$selectionItems$4(SettingsSelectionViewModel settingsSelectionViewModel, InterfaceC9968c<? super SettingsSelectionViewModel$selectionItems$4> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f31122g = settingsSelectionViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super List<? extends AbstractC7789p.b>> interfaceC7117d, String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        SettingsSelectionViewModel$selectionItems$4 settingsSelectionViewModel$selectionItems$4 = new SettingsSelectionViewModel$selectionItems$4(this.f31122g, interfaceC9968c);
        settingsSelectionViewModel$selectionItems$4.f31121f = interfaceC7117d;
        return settingsSelectionViewModel$selectionItems$4.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31120e;
        int i11 = 1;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f31121f;
            SettingsSelectionViewModel settingsSelectionViewModel = this.f31122g;
            String[] stringArray = settingsSelectionViewModel.f31077k.getResources().getStringArray(R.array.pref_lesson_asian_chinese_entries);
            C5207g.m11110e(stringArray, "applicationContext.resou…on_asian_chinese_entries)");
            String[] stringArray2 = settingsSelectionViewModel.f31077k.getResources().getStringArray(R.array.pref_lesson_asian_chinese_values);
            C5207g.m11110e(stringArray2, "applicationContext.resou…son_asian_chinese_values)");
            ArrayList arrayList = new ArrayList(stringArray.length);
            int length = stringArray.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                String str = stringArray[i12];
                int iOrdinal = ViewKeys.ChineseType.ordinal();
                C5207g.m11110e(str, "entry");
                String str2 = stringArray2[i13];
                C5207g.m11110e(str2, "values[index]");
                arrayList.add(new AbstractC7789p.b(iOrdinal, str, str2, C5207g.m11106a(settingsSelectionViewModel.f31060O.getValue(), stringArray2[i13])));
                i12++;
                i13++;
                i11 = 1;
            }
            this.f31120e = i11;
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
