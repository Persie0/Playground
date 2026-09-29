package p166i1;

import androidx.compose.p017ui.node.LayoutNode;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.p051ui.C2516c;
import dm.C5207g;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;
import p339qe.C8596a;
import p397ta.C9237e;
import p454wa.C9892q;
import ua.C9496e;

/* JADX INFO: renamed from: i1.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6161p implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35990a;

    public /* synthetic */ C6161p(int i10) {
        this.f35990a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f35990a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                float f3 = layoutNode.f3760W;
                float f10 = layoutNode2.f3760W;
                return (f3 > f10 ? 1 : (f3 == f10 ? 0 : -1)) == 0 ? C5207g.m11113h(layoutNode.f3750M, layoutNode2.f3750M) : Float.compare(f3, f10);
            case 1:
                return Long.compare(((C9237e) obj).f47899b, ((C9237e) obj2).f47899b);
            case 2:
                return C9496e.h.m17962i((C9496e.h) obj, (C9496e.h) obj2);
            case 3:
                C2516c.b bVar = (C2516c.b) obj;
                C2516c.b bVar2 = (C2516c.b) obj2;
                int iCompare = Integer.compare(bVar2.f13565b, bVar.f13565b);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompareTo = bVar.f13566c.compareTo(bVar2.f13566c);
                return iCompareTo != 0 ? iCompareTo : bVar.f13567d.compareTo(bVar2.f13567d);
            case 4:
                return Float.compare(((C9892q.a) obj).f50524c, ((C9892q.a) obj2).f50524c);
            default:
                Charset charset = C8596a.f46067d;
                return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    }
}
