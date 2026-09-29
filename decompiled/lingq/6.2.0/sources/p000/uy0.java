package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.chat.ChatMessageRating;
import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.feature.chat.AbstractC2008l;
import com.lingq.feature.playlist.AbstractC2253c;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uy0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64501a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f64502b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xi3 f64503c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f64504d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f64505e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f64506f;

    public /* synthetic */ uy0(int i, ui3 ui3Var, ui3 ui3Var2, String str, String str2, boolean z) {
        this.f64501a = 5;
        this.f64506f = str;
        this.f64503c = ui3Var;
        this.f64504d = ui3Var2;
        this.f64502b = z;
        this.f64505e = str2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f64501a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f64505e;
        Object obj4 = this.f64504d;
        xi3 xi3Var = this.f64503c;
        Object obj5 = this.f64506f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC2008l.m8915f((ChatMessageRating) obj4, (ChatMessageRating) obj3, this.f64502b, (String) obj5, (ui3) xi3Var, (ye1) obj, pk9.m19383z(7));
                break;
            case 1:
                ((Integer) obj2).getClass();
                tcd.m21954a((e16) obj4, (p04) obj3, this.f64502b, (ui3) xi3Var, (C0282a) obj5, (ye1) obj, pk9.m19383z(24577));
                break;
            case 2:
                zi3 zi3Var = (zi3) obj4;
                kw5 kw5Var = (kw5) obj3;
                zi3 zi3Var2 = (zi3) obj5;
                zi3 zi3Var3 = (zi3) xi3Var;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                byte b = 0;
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    boolean z = this.f64502b;
                    if (zi3Var != null) {
                        tj3Var.m22111b0(-864613344);
                        pvc.m19507c(AbstractC3393o1.m17727b(z ? kw5Var.f48495b : kw5Var.f48498e, sk1.f60948a), ci8.m4703P(1241781204, new C0844ce(zi3Var, 5, b), tj3Var), tj3Var, 56);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-864297175);
                        tj3Var.m22139q(false);
                    }
                    zf1 zf1Var = sk1.f60948a;
                    pvc.m19507c(AbstractC3393o1.m17727b(z ? kw5Var.f48494a : kw5Var.f48497d, zf1Var), ci8.m4703P(-893579015, new C3836zk(zi3Var, zi3Var2, zi3Var3, 23), tj3Var), tj3Var, 56);
                    if (zi3Var2 == null) {
                        tj3Var.m22111b0(-863079991);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-863399043);
                        pvc.m19507c(AbstractC3393o1.m17727b(z ? kw5Var.f48496c : kw5Var.f48499f, zf1Var), ci8.m4703P(-782441013, new C0844ce(zi3Var2, 6, b), tj3Var), tj3Var, 56);
                        tj3Var.m22139q(false);
                    }
                }
                break;
            case 3:
                List list = (List) obj3;
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(3073);
                AbstractC2253c.m9227m(iM19383z, (ye1) obj, (ui3) xi3Var, (vi3) obj5, (e16) obj4, list, this.f64502b);
                break;
            case 4:
                ((Integer) obj2).getClass();
                d32.m10056p((Playlist) obj4, this.f64502b, (ui3) xi3Var, (ui3) obj3, (ui3) obj5, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(385);
                e2d.m10814c(iM19383z2, (ye1) obj, (ui3) xi3Var, (ui3) obj4, (String) obj5, (String) obj3, this.f64502b);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ uy0(zi3 zi3Var, kw5 kw5Var, boolean z, zi3 zi3Var2, zi3 zi3Var3) {
        this.f64501a = 2;
        this.f64504d = zi3Var;
        this.f64505e = kw5Var;
        this.f64502b = z;
        this.f64506f = zi3Var2;
        this.f64503c = zi3Var3;
    }

    public /* synthetic */ uy0(e16 e16Var, Object obj, boolean z, ui3 ui3Var, xi3 xi3Var, int i, int i2) {
        this.f64501a = i2;
        this.f64504d = e16Var;
        this.f64505e = obj;
        this.f64502b = z;
        this.f64503c = ui3Var;
        this.f64506f = xi3Var;
    }

    public /* synthetic */ uy0(ChatMessageRating chatMessageRating, ChatMessageRating chatMessageRating2, boolean z, String str, ui3 ui3Var, int i) {
        this.f64501a = 0;
        this.f64504d = chatMessageRating;
        this.f64505e = chatMessageRating2;
        this.f64502b = z;
        this.f64506f = str;
        this.f64503c = ui3Var;
    }

    public /* synthetic */ uy0(Playlist playlist, boolean z, ui3 ui3Var, ui3 ui3Var2, ui3 ui3Var3, int i) {
        this.f64501a = 4;
        this.f64504d = playlist;
        this.f64502b = z;
        this.f64503c = ui3Var;
        this.f64505e = ui3Var2;
        this.f64506f = ui3Var3;
    }
}
