package p128g2;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.HashMap;
import java.util.HashSet;
import p107f2.AbstractC5465d;

/* JADX INFO: renamed from: g2.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5666d {

    /* JADX INFO: renamed from: a */
    public int f34497a = -1;

    /* JADX INFO: renamed from: b */
    public int f34498b = -1;

    /* JADX INFO: renamed from: c */
    public String f34499c = null;

    /* JADX INFO: renamed from: d */
    public HashMap<String, ConstraintAttribute> f34500d;

    /* JADX INFO: renamed from: a */
    public abstract void mo12024a(HashMap<String, AbstractC5465d> map);

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC5666d clone();

    /* JADX INFO: renamed from: c */
    public AbstractC5666d m12026c(AbstractC5666d abstractC5666d) {
        this.f34497a = abstractC5666d.f34497a;
        this.f34498b = abstractC5666d.f34498b;
        this.f34499c = abstractC5666d.f34499c;
        this.f34500d = abstractC5666d.f34500d;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo12027d(HashSet<String> hashSet);

    /* JADX INFO: renamed from: e */
    public abstract void mo12028e(Context context, AttributeSet attributeSet);

    /* JADX INFO: renamed from: f */
    public void mo12029f(HashMap<String, Integer> map) {
    }
}
