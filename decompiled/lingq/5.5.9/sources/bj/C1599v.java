package bj;

import ae.C0062b;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import com.lingq.util.C4924a;
import dm.C5207g;
import kotlin.Pair;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7137r;

/* JADX INFO: renamed from: bj.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C1599v implements InterfaceC1598u {

    /* JADX INFO: renamed from: a */
    public final C7138s f9081a;

    /* JADX INFO: renamed from: b */
    public final C7138s f9082b;

    /* JADX INFO: renamed from: c */
    public final C7138s f9083c;

    /* JADX INFO: renamed from: d */
    public final C7134o f9084d;

    /* JADX INFO: renamed from: e */
    public final C7134o f9085e;

    /* JADX INFO: renamed from: f */
    public final C7134o f9086f;

    public C1599v() {
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f9081a = c7138sM10448a;
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f9082b = c7138sM10448a2;
        C7138s c7138sM10448a3 = C4924a.m10448a();
        this.f9083c = c7138sM10448a3;
        this.f9084d = C0062b.m303R(c7138sM10448a);
        this.f9085e = C0062b.m303R(c7138sM10448a2);
        this.f9086f = C0062b.m303R(c7138sM10448a3);
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: F1 */
    public final void mo5248F1(UserPlaylist userPlaylist) {
        C5207g.m11111f(userPlaylist, "playlist");
        this.f9082b.mo14371k(userPlaylist);
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: J1 */
    public final InterfaceC7137r<UserPlaylist> mo5249J1() {
        return this.f9086f;
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: M */
    public final void mo5250M(UserPlaylist userPlaylist) {
        this.f9083c.mo14371k(userPlaylist);
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: d1 */
    public final InterfaceC7137r<UserPlaylist> mo5251d1() {
        return this.f9085e;
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: q0 */
    public final void mo5252q0(String str, String str2) {
        C5207g.m11111f(str, "oldName");
        C5207g.m11111f(str2, "newName");
        this.f9081a.mo14371k(new Pair(str, str2));
    }

    @Override // bj.InterfaceC1598u
    /* JADX INFO: renamed from: v */
    public final InterfaceC7137r<Pair<String, String>> mo5253v() {
        return this.f9084d;
    }
}
