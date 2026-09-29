package p000;

import com.lingq.core.domain.model.chat.ChatMessage;
import com.lingq.core.settings.theme.ThemeSettingsTab;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ny0 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53378a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nz9 f53379b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f53380c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f53381d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f53382e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f53383f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f53384g;

    public /* synthetic */ ny0(nz9 nz9Var, ThemeSettingsTab themeSettingsTab, vi3 vi3Var, vi3 vi3Var2, n4b n4bVar, boolean z) {
        this.f53379b = nz9Var;
        this.f53381d = themeSettingsTab;
        this.f53382e = vi3Var;
        this.f53383f = vi3Var2;
        this.f53384g = n4bVar;
        this.f53380c = z;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0466  */
    /* JADX WARN: Code duplicated, block: B:109:0x0484  */
    /* JADX WARN: Code duplicated, block: B:115:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:118:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:119:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:87:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:90:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:94:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:97:0x0415  */
    /* JADX WARN: Code duplicated, block: B:99:0x0438  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v11 java.lang.Object, still in use, count: 2, list:
          (r9v11 java.lang.Object) from 0x039e: PHI (r9 I:??) = (r9v4 java.lang.Object), (r9v11 java.lang.Object) binds: [B:83:0x039d, B:129:0x039e] A[DONT_GENERATE, DONT_INLINE]
          (r9v11 java.lang.Object) from 0x0392: CHECK_CAST (d87) (r9v11 java.lang.Object)
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
    @Override // p000.aj3
    public final java.lang.Object invoke(java.lang.Object r59, java.lang.Object r60, java.lang.Object r61) {
        /*
            Method dump skipped, instruction units count: 1304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ny0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ ny0(String str, jw0 jw0Var, jv0 jv0Var, ChatMessage chatMessage, nz9 nz9Var, boolean z) {
        this.f53381d = str;
        this.f53382e = jw0Var;
        this.f53383f = jv0Var;
        this.f53384g = chatMessage;
        this.f53379b = nz9Var;
        this.f53380c = z;
    }
}
