package com.lingq.p055ui.settings;

import android.content.Context;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p278nh.AbstractC7789p;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.settings.SettingsSelectionViewModel$updateSetting$1", m19206f = "SettingsSelectionViewModel.kt", m19207l = {568, 569, 572, 573, 574, 584, 589, 592, 595, 598, 601, 603, 606, 609, 616, 626, 628, 630, 633, 635, 647, 651}, m19208m = "invokeSuspend")
final class SettingsSelectionViewModel$updateSetting$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public Object f31143e;

    /* JADX INFO: renamed from: f */
    public SettingsSelectionViewModel f31144f;

    /* JADX INFO: renamed from: g */
    public int f31145g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC7789p f31146h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SettingsSelectionViewModel f31147i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f31148j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Context f31149k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsSelectionViewModel$updateSetting$1(AbstractC7789p abstractC7789p, SettingsSelectionViewModel settingsSelectionViewModel, String str, Context context, InterfaceC9968c<? super SettingsSelectionViewModel$updateSetting$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31146h = abstractC7789p;
        this.f31147i = settingsSelectionViewModel;
        this.f31148j = str;
        this.f31149k = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new SettingsSelectionViewModel$updateSetting$1(this.f31146h, this.f31147i, this.f31148j, this.f31149k, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SettingsSelectionViewModel$updateSetting$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0274  */
    /* JADX WARN: Code duplicated, block: B:115:0x028e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0290  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:124:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:130:0x02da  */
    /* JADX WARN: Code duplicated, block: B:136:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:138:0x030c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:139:0x030d  */
    /* JADX WARN: Code duplicated, block: B:142:0x0330  */
    /* JADX WARN: Code duplicated, block: B:163:0x02ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x01de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v45 java.lang.Object, still in use, count: 2, list:
          (r1v45 java.lang.Object) from 0x026e: PHI (r1 I:??) = (r1v41 java.lang.Object), (r1v45 java.lang.Object) binds: [B:110:0x026d, B:109:0x026b] A[DONT_GENERATE, DONT_INLINE]
          (r1v45 java.lang.Object) from 0x0260: CHECK_CAST (com.lingq.shared.uimodel.TextToSpeechVoice) (r1v45 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.p055ui.settings.SettingsSelectionViewModel$updateSetting$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
