package p000;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j5b extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a */
    public final m80 f45099a;

    /* JADX INFO: renamed from: b */
    public List f45100b;

    /* JADX INFO: renamed from: c */
    public ArrayList f45101c;

    /* JADX INFO: renamed from: d */
    public final HashMap f45102d;

    public j5b(m80 m80Var) {
        super(m80Var.f50743a);
        this.f45102d = new HashMap();
        this.f45099a = m80Var;
    }

    /* JADX INFO: renamed from: a */
    public final m5b m14301a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.f45102d;
        m5b m5bVar = (m5b) map.get(windowInsetsAnimation);
        if (m5bVar != null) {
            return m5bVar;
        }
        m5b m5bVar2 = new m5b(0, null, 0L);
        m5bVar2.f50624a = new k5b(windowInsetsAnimation);
        map.put(windowInsetsAnimation, m5bVar2);
        return m5bVar2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f45099a.mo14068g(m14301a(windowInsetsAnimation));
        this.f45102d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f45099a.mo14069h(m14301a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f45101c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f45101c = arrayList2;
            this.f45100b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM13673f = i5b.m13673f(list.get(size));
            m5b m5bVarM14301a = m14301a(windowInsetsAnimationM13673f);
            m5bVarM14301a.f50624a.mo14860e(windowInsetsAnimationM13673f.getFraction());
            this.f45101c.add(m5bVarM14301a);
        }
        return this.f45099a.mo14070i(f6b.m11570g(null, windowInsets), this.f45100b).m11575f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        p33 p33VarMo14071j = this.f45099a.mo14071j(m14301a(windowInsetsAnimation), new p33(bounds));
        p33VarMo14071j.getClass();
        AbstractC3289l8.m15988B();
        return i5b.m13671d(((l64) p33VarMo14071j.f55513b).m15832e(), ((l64) p33VarMo14071j.f55514c).m15832e());
    }
}
