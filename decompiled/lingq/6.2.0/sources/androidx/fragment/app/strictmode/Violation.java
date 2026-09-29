package androidx.fragment.app.strictmode;

import androidx.fragment.app.AbstractComponentCallbacksC0635c;

/* JADX INFO: loaded from: classes.dex */
public abstract class Violation extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final AbstractComponentCallbacksC0635c f5771a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, String str) {
        super(str);
        abstractComponentCallbacksC0635c.getClass();
        this.f5771a = abstractComponentCallbacksC0635c;
    }
}
