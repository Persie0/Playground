package com.lingq.p055ui.settings;

import cm.InterfaceC2059s;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.shared.uimodel.LocalTextToSpeechVoice;
import com.lingq.shared.uimodel.TextToSpeechVoice;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p278nh.AbstractC7789p;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/TextToSpeechVoice;", "voices", "", "", "selectedVoice", "Lcom/lingq/shared/uimodel/LocalTextToSpeechVoice;", "selectedLocalTTSVoice", "", "useWebVoices", "", "Lnh/p;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.settings.SettingsSelectionViewModel$selectionItems$8", m19206f = "SettingsSelectionViewModel.kt", m19207l = {358}, m19208m = "invokeSuspend")
final class SettingsSelectionViewModel$selectionItems$8 extends SuspendLambda implements InterfaceC2059s<List<? extends TextToSpeechVoice>, Map<String, ? extends TextToSpeechVoice>, Map<String, ? extends LocalTextToSpeechVoice>, Boolean, InterfaceC9968c<? super List<AbstractC7789p>>, Object> {

    /* JADX INFO: renamed from: e */
    public ArrayList f31133e;

    /* JADX INFO: renamed from: f */
    public int f31134f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ List f31135g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Map f31136h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Map f31137i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ boolean f31138j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ SettingsSelectionViewModel f31139k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsSelectionViewModel$selectionItems$8(SettingsSelectionViewModel settingsSelectionViewModel, InterfaceC9968c<? super SettingsSelectionViewModel$selectionItems$8> interfaceC9968c) {
        super(5, interfaceC9968c);
        this.f31139k = settingsSelectionViewModel;
    }

    @Override // cm.InterfaceC2059s
    /* JADX INFO: renamed from: o0 */
    public final Object mo1501o0(List<? extends TextToSpeechVoice> list, Map<String, ? extends TextToSpeechVoice> map, Map<String, ? extends LocalTextToSpeechVoice> map2, Boolean bool, InterfaceC9968c<? super List<AbstractC7789p>> interfaceC9968c) {
        boolean zBooleanValue = bool.booleanValue();
        SettingsSelectionViewModel$selectionItems$8 settingsSelectionViewModel$selectionItems$8 = new SettingsSelectionViewModel$selectionItems$8(this.f31139k, interfaceC9968c);
        settingsSelectionViewModel$selectionItems$8.f31135g = list;
        settingsSelectionViewModel$selectionItems$8.f31136h = map;
        settingsSelectionViewModel$selectionItems$8.f31137i = map2;
        settingsSelectionViewModel$selectionItems$8.f31138j = zBooleanValue;
        return settingsSelectionViewModel$selectionItems$8.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        List<TextToSpeechVoice> list;
        Map map;
        boolean z10;
        ArrayList arrayList;
        Map map2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31134f;
        SettingsSelectionViewModel settingsSelectionViewModel = this.f31139k;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            list = this.f31135g;
            map = this.f31136h;
            Map map3 = this.f31137i;
            boolean z11 = this.f31138j;
            ArrayList arrayList2 = new ArrayList();
            InterfaceC3275c interfaceC3275c = settingsSelectionViewModel.f31074h;
            String strMo498E1 = settingsSelectionViewModel.mo498E1();
            this.f31135g = list;
            this.f31136h = map;
            this.f31137i = map3;
            this.f31133e = arrayList2;
            this.f31138j = z11;
            this.f31134f = 1;
            Object objMo9342h0 = interfaceC3275c.mo9342h0(strMo498E1, this);
            if (objMo9342h0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            z10 = z11;
            arrayList = arrayList2;
            map2 = map3;
            obj = objMo9342h0;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = this.f31138j;
            arrayList = this.f31133e;
            map2 = this.f31137i;
            map = this.f31136h;
            list = this.f31135g;
            C7499b.m14977z0(obj);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList3 = new ArrayList(C9325m.m17681z(iterable, 10));
        Iterator it = iterable.iterator();
        while (true) {
            LocalTextToSpeechVoice localTextToSpeechVoice = null;
            if (!it.hasNext()) {
                break;
            }
            LocalTextToSpeechVoice localTextToSpeechVoice2 = (LocalTextToSpeechVoice) it.next();
            int iOrdinal = ViewKeys.TTSVoice.ordinal();
            String str = localTextToSpeechVoice2.f21602b;
            if (map2 != null) {
                localTextToSpeechVoice = (LocalTextToSpeechVoice) map2.get(settingsSelectionViewModel.mo498E1());
            }
            arrayList3.add(new AbstractC7789p.b(iOrdinal, str, localTextToSpeechVoice2.f21601a, C5207g.m11106a(localTextToSpeechVoice, localTextToSpeechVoice2)));
        }
        ArrayList arrayList4 = new ArrayList(C9325m.m17681z(list, 10));
        for (TextToSpeechVoice textToSpeechVoice : list) {
            int iOrdinal2 = ViewKeys.TTSVoice.ordinal();
            String str2 = textToSpeechVoice.f21617b;
            arrayList4.add(new AbstractC7789p.b(iOrdinal2, str2, str2, C5207g.m11106a(map != null ? (TextToSpeechVoice) map.get(settingsSelectionViewModel.mo498E1()) : null, textToSpeechVoice)));
        }
        if (arrayList3.isEmpty()) {
            arrayList.addAll(arrayList4);
        } else {
            arrayList.add(new AbstractC7789p.d(R.string.settings_text_to_speech_web_voices));
            arrayList.add(new AbstractC7789p.c(ViewKeys.UseWebVoices.ordinal(), R.string.settings_text_to_speech_use_web_voices, z10));
            arrayList.addAll(arrayList4);
            arrayList.add(new AbstractC7789p.d(R.string.settings_text_to_speech_local_voices));
            arrayList.addAll(arrayList3);
        }
        return arrayList;
    }
}
