package p000;

import android.content.Context;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.core.domain.playlist.C1521d;
import com.lingq.core.domain.playlist.C1524g;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.feature.widget.C2863a;
import com.lingq.feature.widget.R$string;
import com.lingq.feature.widget.layout.network.PlaylistDataUpdateWorker;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ef7 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37185a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f37186b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1521d f37187c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f37188d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1524g f37189e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2863a f37190f;

    public /* synthetic */ ef7(cma cmaVar, C1521d c1521d, Context context, C1524g c1524g, C2863a c2863a, int i) {
        this.f37185a = i;
        this.f37186b = cmaVar;
        this.f37187c = c1521d;
        this.f37188d = context;
        this.f37189e = c1524g;
        this.f37190f = c2863a;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        String strM8117b;
        String strM8117b2;
        int i = this.f37185a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    ci8.m4716b(null, ci8.m4703P(-283095256, new ef7(this.f37186b, this.f37187c, this.f37188d, this.f37189e, this.f37190f, 1), tj3Var), tj3Var, 48);
                }
                break;
            default:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    Language language = (Language) AbstractC0278f.m1252b(this.f37186b.mo4572B0(), tj3Var2).getValue();
                    String str = language != null ? language.f19024a : null;
                    if (str == null) {
                        tj3Var2.m22111b0(1625979806);
                        x74.m24344a(R$string.f33824xdd299a4b, Integer.valueOf(R$drawable.ic_playlist_icon), com.lingq.core.p012ui.R$string.ui_open, R$drawable.ic_chevron_right_s, false, r46.m20385j("open app"), r46.m20385j("open app"), tj3Var2, 0, 16);
                        tj3Var2.m22139q(false);
                    } else {
                        tj3Var2.m22111b0(1625196901);
                        t66 t66VarM1251a = AbstractC0278f.m1251a(this.f37187c.m8197a(str), null, null, tj3Var2, 48, 2);
                        jd7 jd7Var = PlaylistDataUpdateWorker.Companion;
                        Playlist playlist = (Playlist) t66VarM1251a.getValue();
                        int iM8118c = playlist != null ? playlist.m8118c() : 0;
                        Playlist playlist2 = (Playlist) t66VarM1251a.getValue();
                        String str2 = "";
                        if (playlist2 == null || (strM8117b = playlist2.m8117b()) == null) {
                            strM8117b = "";
                        }
                        jd7Var.getClass();
                        jd7.m14402a(iM8118c, this.f37188d, str, strM8117b);
                        Playlist playlist3 = (Playlist) t66VarM1251a.getValue();
                        if (playlist3 != null && (strM8117b2 = playlist3.m8117b()) != null) {
                            str2 = strM8117b2;
                        }
                        Playlist playlist4 = (Playlist) t66VarM1251a.getValue();
                        this.f37190f.m9775h((List) AbstractC0278f.m1251a(this.f37189e.m8201a(playlist4 != null ? playlist4.m8118c() : 0, str2), EmptyList.f47638a, null, tj3Var2, 48, 2).getValue(), (Playlist) t66VarM1251a.getValue(), tj3Var2, 0);
                        tj3Var2.m22139q(false);
                    }
                }
                break;
        }
        return xfaVar;
    }
}
