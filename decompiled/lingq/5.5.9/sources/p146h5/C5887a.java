package p146h5;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import p170i5.AbstractC6189h;
import p214k5.C6617s;

/* JADX INFO: renamed from: h5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5887a extends AbstractC5889c {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f35216f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5887a(AbstractC6189h abstractC6189h, int i10) {
        super(abstractC6189h);
        this.f35216f = i10;
        if (i10 != 1) {
            C5207g.m11111f(abstractC6189h, "tracker");
        } else {
            C5207g.m11111f(abstractC6189h, "tracker");
            super(abstractC6189h);
        }
    }

    @Override // p146h5.AbstractC5889c
    /* JADX INFO: renamed from: b */
    public final boolean mo12313b(C6617s c6617s) {
        switch (this.f35216f) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C5207g.m11111f(c6617s, "workSpec");
                return c6617s.f37533j.f8047b;
            default:
                C5207g.m11111f(c6617s, "workSpec");
                return c6617s.f37533j.f8050e;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000f. Please report as an issue. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // p146h5.AbstractC5889c
    /* JADX INFO: renamed from: c */
    public final boolean mo12314c(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f35216f
            r2 = 1
            switch(r0) {
                case 0: goto L8;
                default: goto L6;
            }
        L6:
            r2 = 4
            goto L15
        L8:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r1 = r4.booleanValue()
            r4 = r1
            switch(r0) {
                case 0: goto L12;
                default: goto L12;
            }
        L12:
            r4 = r4 ^ 1
            return r4
        L15:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r1 = r4.booleanValue()
            r4 = r1
            switch(r0) {
                case 0: goto L20;
                default: goto L1f;
            }
        L1f:
            r2 = 4
        L20:
            r4 = r4 ^ 1
            r2 = 4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p146h5.C5887a.mo12314c(java.lang.Object):boolean");
    }
}
