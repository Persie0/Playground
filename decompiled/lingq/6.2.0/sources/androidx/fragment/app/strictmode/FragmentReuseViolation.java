package androidx.fragment.app.strictmode;

import androidx.fragment.app.AbstractComponentCallbacksC0635c;

/* JADX INFO: loaded from: classes2.dex */
public final class FragmentReuseViolation extends Violation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentReuseViolation(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, String str) {
        super(abstractComponentCallbacksC0635c, "Attempting to reuse fragment " + abstractComponentCallbacksC0635c + " with previous ID " + str);
        str.getClass();
    }
}
