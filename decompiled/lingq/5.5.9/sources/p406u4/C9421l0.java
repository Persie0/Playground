package p406u4;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.media.AbstractC0140a;
import android.support.v4.media.session.C0166e;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p003a2.C0009a;
import p286o2.C7911k;

/* JADX INFO: renamed from: u4.l0 */
/* JADX INFO: loaded from: classes.dex */
public class C9421l0 extends AbstractC9409f0 {

    /* JADX INFO: renamed from: Y */
    public ArrayList<AbstractC9409f0> f48356Y;

    /* JADX INFO: renamed from: Z */
    public boolean f48357Z;

    /* JADX INFO: renamed from: a0 */
    public int f48358a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f48359b0;

    /* JADX INFO: renamed from: c0 */
    public int f48360c0;

    /* JADX INFO: renamed from: u4.l0$a */
    public class a extends C9417j0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC9409f0 f48361a;

        public a(AbstractC9409f0 abstractC9409f0) {
            this.f48361a = abstractC9409f0;
        }

        @Override // p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: e */
        public final void mo17768e(AbstractC9409f0 abstractC9409f0) {
            this.f48361a.mo17782I();
            abstractC9409f0.mo17779F(this);
        }
    }

    /* JADX INFO: renamed from: u4.l0$b */
    public static class b extends C9417j0 {

        /* JADX INFO: renamed from: a */
        public final C9421l0 f48362a;

        public b(C9421l0 c9421l0) {
            this.f48362a = c9421l0;
        }

        @Override // p406u4.C9417j0, p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: b */
        public final void mo17810b(AbstractC9409f0 abstractC9409f0) {
            C9421l0 c9421l0 = this.f48362a;
            if (!c9421l0.f48359b0) {
                c9421l0.m17789P();
                c9421l0.f48359b0 = true;
            }
        }

        @Override // p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: e */
        public final void mo17768e(AbstractC9409f0 abstractC9409f0) {
            C9421l0 c9421l0 = this.f48362a;
            int i10 = c9421l0.f48358a0 - 1;
            c9421l0.f48358a0 = i10;
            if (i10 == 0) {
                c9421l0.f48359b0 = false;
                c9421l0.m17802s();
            }
            abstractC9409f0.mo17779F(this);
        }
    }

    public C9421l0() {
        this.f48356Y = new ArrayList<>();
        this.f48357Z = true;
        this.f48359b0 = false;
        this.f48360c0 = 0;
    }

    @SuppressLint({"RestrictedApi"})
    public C9421l0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48356Y = new ArrayList<>();
        this.f48357Z = true;
        this.f48359b0 = false;
        this.f48360c0 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9407e0.f48267h);
        m17824W(C7911k.m15688f(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: E */
    public final void mo17778E(View view) {
        super.mo17778E(view);
        int size = this.f48356Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f48356Y.get(i10).mo17778E(view);
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: F */
    public final void mo17779F(AbstractC9409f0.e eVar) {
        super.mo17779F(eVar);
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: G */
    public final void mo17780G(View view) {
        for (int i10 = 0; i10 < this.f48356Y.size(); i10++) {
            this.f48356Y.get(i10).mo17780G(view);
        }
        this.f48296f.remove(view);
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: H */
    public final void mo17781H(ViewGroup viewGroup) {
        super.mo17781H(viewGroup);
        int size = this.f48356Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f48356Y.get(i10).mo17781H(viewGroup);
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: I */
    public final void mo17782I() {
        if (this.f48356Y.isEmpty()) {
            m17789P();
            m17802s();
            return;
        }
        b bVar = new b(this);
        Iterator<AbstractC9409f0> it = this.f48356Y.iterator();
        while (it.hasNext()) {
            it.next().mo17791b(bVar);
        }
        this.f48358a0 = this.f48356Y.size();
        if (this.f48357Z) {
            Iterator<AbstractC9409f0> it2 = this.f48356Y.iterator();
            while (it2.hasNext()) {
                it2.next().mo17782I();
            }
        } else {
            for (int i10 = 1; i10 < this.f48356Y.size(); i10++) {
                this.f48356Y.get(i10 - 1).mo17791b(new a(this.f48356Y.get(i10)));
            }
            AbstractC9409f0 abstractC9409f0 = this.f48356Y.get(0);
            if (abstractC9409f0 != null) {
                abstractC9409f0.mo17782I();
            }
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: K */
    public final void mo17784K(AbstractC9409f0.d dVar) {
        this.f48289T = dVar;
        this.f48360c0 |= 8;
        int size = this.f48356Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f48356Y.get(i10).mo17784K(dVar);
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: M */
    public final void mo17786M(AbstractC9446y abstractC9446y) {
        super.mo17786M(abstractC9446y);
        this.f48360c0 |= 4;
        if (this.f48356Y != null) {
            for (int i10 = 0; i10 < this.f48356Y.size(); i10++) {
                this.f48356Y.get(i10).mo17786M(abstractC9446y);
            }
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: N */
    public final void mo17787N(AbstractC0140a abstractC0140a) {
        this.f48288S = abstractC0140a;
        this.f48360c0 |= 2;
        int size = this.f48356Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f48356Y.get(i10).mo17787N(abstractC0140a);
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: O */
    public final void mo17788O(long j10) {
        this.f48292b = j10;
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: R */
    public final String mo17790R(String str) {
        String strMo17790R = super.mo17790R(str);
        for (int i10 = 0; i10 < this.f48356Y.size(); i10++) {
            StringBuilder sbM26o = C0009a.m26o(strMo17790R, "\n");
            sbM26o.append(this.f48356Y.get(i10).mo17790R(str + "  "));
            strMo17790R = sbM26o.toString();
        }
        return strMo17790R;
    }

    /* JADX INFO: renamed from: S */
    public final void m17821S(AbstractC9409f0 abstractC9409f0) {
        this.f48356Y.add(abstractC9409f0);
        abstractC9409f0.f48278I = this;
        long j10 = this.f48293c;
        if (j10 >= 0) {
            abstractC9409f0.mo17783J(j10);
        }
        if ((this.f48360c0 & 1) != 0) {
            abstractC9409f0.mo17785L(this.f48294d);
        }
        if ((this.f48360c0 & 2) != 0) {
            abstractC9409f0.mo17787N(this.f48288S);
        }
        if ((this.f48360c0 & 4) != 0) {
            abstractC9409f0.mo17786M(this.f48290U);
        }
        if ((this.f48360c0 & 8) != 0) {
            abstractC9409f0.mo17784K(this.f48289T);
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void mo17783J(long j10) {
        ArrayList<AbstractC9409f0> arrayList;
        this.f48293c = j10;
        if (j10 < 0 || (arrayList = this.f48356Y) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f48356Y.get(i10).mo17783J(j10);
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final void mo17785L(TimeInterpolator timeInterpolator) {
        this.f48360c0 |= 1;
        ArrayList<AbstractC9409f0> arrayList = this.f48356Y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f48356Y.get(i10).mo17785L(timeInterpolator);
            }
        }
        this.f48294d = timeInterpolator;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: W */
    public final void m17824W(int i10) {
        if (i10 == 0) {
            this.f48357Z = true;
        } else {
            if (i10 != 1) {
                throw new AndroidRuntimeException(C0166e.m761g("Invalid parameter for TransitionSet ordering: ", i10));
            }
            this.f48357Z = false;
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: b */
    public final void mo17791b(AbstractC9409f0.e eVar) {
        super.mo17791b(eVar);
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: c */
    public final void mo17792c(int i10) {
        for (int i11 = 0; i11 < this.f48356Y.size(); i11++) {
            this.f48356Y.get(i11).mo17792c(i10);
        }
        super.mo17792c(i10);
    }

    @Override // p406u4.AbstractC9409f0
    public final void cancel() {
        super.cancel();
        int size = this.f48356Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f48356Y.get(i10).cancel();
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: d */
    public final void mo17793d(View view) {
        for (int i10 = 0; i10 < this.f48356Y.size(); i10++) {
            this.f48356Y.get(i10).mo17793d(view);
        }
        this.f48296f.add(view);
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: e */
    public final void mo17794e(Class cls) {
        for (int i10 = 0; i10 < this.f48356Y.size(); i10++) {
            this.f48356Y.get(i10).mo17794e(cls);
        }
        super.mo17794e(cls);
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: f */
    public final void mo17795f(String str) {
        for (int i10 = 0; i10 < this.f48356Y.size(); i10++) {
            this.f48356Y.get(i10).mo17795f(str);
        }
        super.mo17795f(str);
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: h */
    public final void mo17761h(C9425n0 c9425n0) {
        View view = c9425n0.f48373b;
        if (m17777B(view)) {
            Iterator<AbstractC9409f0> it = this.f48356Y.iterator();
            loop0: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    AbstractC9409f0 next = it.next();
                    if (next.m17777B(view)) {
                        next.mo17761h(c9425n0);
                        c9425n0.f48374c.add(next);
                    }
                }
            }
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: j */
    public final void mo17797j(C9425n0 c9425n0) {
        super.mo17797j(c9425n0);
        int size = this.f48356Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f48356Y.get(i10).mo17797j(c9425n0);
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: k */
    public final void mo17762k(C9425n0 c9425n0) {
        View view = c9425n0.f48373b;
        if (m17777B(view)) {
            while (true) {
                for (AbstractC9409f0 abstractC9409f0 : this.f48356Y) {
                    if (abstractC9409f0.m17777B(view)) {
                        abstractC9409f0.mo17762k(c9425n0);
                        c9425n0.f48374c.add(abstractC9409f0);
                    }
                }
                return;
            }
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: o */
    public final AbstractC9409f0 clone() {
        C9421l0 c9421l0 = (C9421l0) super.clone();
        c9421l0.f48356Y = new ArrayList<>();
        int size = this.f48356Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC9409f0 abstractC9409f0Clone = this.f48356Y.get(i10).clone();
            c9421l0.f48356Y.add(abstractC9409f0Clone);
            abstractC9409f0Clone.f48278I = c9421l0;
        }
        return c9421l0;
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: r */
    public final void mo17801r(ViewGroup viewGroup, C9427o0 c9427o0, C9427o0 c9427o1, ArrayList<C9425n0> arrayList, ArrayList<C9425n0> arrayList2) {
        long j10 = this.f48292b;
        int size = this.f48356Y.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC9409f0 abstractC9409f0 = this.f48356Y.get(i10);
            if (j10 > 0 && (this.f48357Z || i10 == 0)) {
                long j11 = abstractC9409f0.f48292b;
                if (j11 > 0) {
                    abstractC9409f0.mo17788O(j11 + j10);
                } else {
                    abstractC9409f0.mo17788O(j10);
                }
            }
            abstractC9409f0.mo17801r(viewGroup, c9427o0, c9427o1, arrayList, arrayList2);
        }
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: t */
    public final void mo17803t(int i10) {
        for (int i11 = 0; i11 < this.f48356Y.size(); i11++) {
            this.f48356Y.get(i11).mo17803t(i10);
        }
        super.mo17803t(i10);
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: u */
    public final void mo17804u(Class cls) {
        for (int i10 = 0; i10 < this.f48356Y.size(); i10++) {
            this.f48356Y.get(i10).mo17804u(cls);
        }
        super.mo17804u(cls);
    }

    @Override // p406u4.AbstractC9409f0
    /* JADX INFO: renamed from: v */
    public final void mo17805v(String str) {
        for (int i10 = 0; i10 < this.f48356Y.size(); i10++) {
            this.f48356Y.get(i10).mo17805v(str);
        }
        super.mo17805v(str);
    }
}
