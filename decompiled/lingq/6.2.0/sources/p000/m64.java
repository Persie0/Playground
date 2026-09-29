package p000;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m64 extends m80 {

    /* JADX INFO: renamed from: c */
    public final View f50653c;

    /* JADX INFO: renamed from: d */
    public int f50654d;

    /* JADX INFO: renamed from: e */
    public int f50655e;

    /* JADX INFO: renamed from: f */
    public final int[] f50656f;

    public m64(View view) {
        super(0);
        this.f50656f = new int[2];
        this.f50653c = view;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: g */
    public final void mo14068g(m5b m5bVar) {
        this.f50653c.setTranslationY(0.0f);
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: h */
    public final void mo14069h(m5b m5bVar) {
        View view = this.f50653c;
        int[] iArr = this.f50656f;
        view.getLocationOnScreen(iArr);
        this.f50654d = iArr[1];
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: i */
    public final f6b mo14070i(f6b f6bVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m5b m5bVar = (m5b) it.next();
            if ((m5bVar.f50624a.mo14859d() & 8) != 0) {
                this.f50653c.setTranslationY(AbstractC0853cn.m4880c(this.f50655e, m5bVar.f50624a.mo14858c(), 0));
                break;
            }
        }
        return f6bVar;
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: j */
    public final p33 mo14071j(m5b m5bVar, p33 p33Var) {
        View view = this.f50653c;
        int[] iArr = this.f50656f;
        view.getLocationOnScreen(iArr);
        int i = this.f50654d - iArr[1];
        this.f50655e = i;
        view.setTranslationY(i);
        return p33Var;
    }
}
