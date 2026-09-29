package p504y9;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import dm.C5207g;
import java.util.Comparator;
import p260m8.C7499b;

/* JADX INFO: renamed from: y9.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10317j implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51881a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f51882b;

    public /* synthetic */ C10317j(int i10, Object obj) {
        this.f51881a = i10;
        this.f51882b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = this.f51881a;
        Object obj3 = this.f51882b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                MediaCodecUtil.InterfaceC2423e interfaceC2423e = (MediaCodecUtil.InterfaceC2423e) obj3;
                return interfaceC2423e.mo7175d(obj2) - interfaceC2423e.mo7175d(obj);
            default:
                InterfaceC2052l[] interfaceC2052lArr = (InterfaceC2052l[]) obj3;
                C5207g.m11111f(interfaceC2052lArr, "$selectors");
                for (InterfaceC2052l interfaceC2052l : interfaceC2052lArr) {
                    int iM14951m = C7499b.m14951m((Comparable) interfaceC2052l.mo528n(obj), (Comparable) interfaceC2052l.mo528n(obj2));
                    if (iM14951m != 0) {
                        return iM14951m;
                    }
                }
                return 0;
        }
    }
}
