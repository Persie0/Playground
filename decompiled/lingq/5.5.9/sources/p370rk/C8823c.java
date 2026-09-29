package p370rk;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerError;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;
import dm.C5207g;
import p304ok.InterfaceC8066b;
import pk.AbstractC8400a;

/* JADX INFO: renamed from: rk.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C8823c extends AbstractC8400a {

    /* JADX INFO: renamed from: a */
    public boolean f46721a;

    /* JADX INFO: renamed from: b */
    public boolean f46722b;

    /* JADX INFO: renamed from: c */
    public PlayerConstants$PlayerError f46723c;

    /* JADX INFO: renamed from: d */
    public String f46724d;

    /* JADX INFO: renamed from: e */
    public float f46725e;

    /* JADX INFO: renamed from: rk.c$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f46726a;

        static {
            int[] iArr = new int[PlayerConstants$PlayerState.values().length];
            try {
                iArr[PlayerConstants$PlayerState.ENDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerConstants$PlayerState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayerConstants$PlayerState.PLAYING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f46726a = iArr;
        }
    }

    @Override // pk.AbstractC8400a, pk.InterfaceC8403d
    /* JADX INFO: renamed from: a */
    public final void mo16422a(InterfaceC8066b interfaceC8066b, PlayerConstants$PlayerError playerConstants$PlayerError) {
        C5207g.m11111f(interfaceC8066b, "youTubePlayer");
        if (playerConstants$PlayerError == PlayerConstants$PlayerError.HTML_5_PLAYER) {
            this.f46723c = playerConstants$PlayerError;
        }
    }

    @Override // pk.AbstractC8400a, pk.InterfaceC8403d
    /* JADX INFO: renamed from: c */
    public final void mo16424c(InterfaceC8066b interfaceC8066b, String str) {
        C5207g.m11111f(interfaceC8066b, "youTubePlayer");
        this.f46724d = str;
    }

    @Override // pk.AbstractC8400a, pk.InterfaceC8403d
    /* JADX INFO: renamed from: d */
    public final void mo9988d(InterfaceC8066b interfaceC8066b, float f3) {
        C5207g.m11111f(interfaceC8066b, "youTubePlayer");
        this.f46725e = f3;
    }

    @Override // pk.AbstractC8400a, pk.InterfaceC8403d
    /* JADX INFO: renamed from: i */
    public final void mo9990i(InterfaceC8066b interfaceC8066b, PlayerConstants$PlayerState playerConstants$PlayerState) {
        C5207g.m11111f(interfaceC8066b, "youTubePlayer");
        int i10 = a.f46726a[playerConstants$PlayerState.ordinal()];
        if (i10 == 1 || i10 == 2) {
            this.f46722b = false;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f46722b = true;
        }
    }
}
