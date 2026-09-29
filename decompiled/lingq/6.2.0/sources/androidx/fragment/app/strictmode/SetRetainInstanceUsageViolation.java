package androidx.fragment.app.strictmode;

import androidx.fragment.app.AbstractComponentCallbacksC0635c;

/* JADX INFO: loaded from: classes2.dex */
public final class SetRetainInstanceUsageViolation extends RetainInstanceUsageViolation {
    public SetRetainInstanceUsageViolation(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        super(abstractComponentCallbacksC0635c, "Attempting to set retain instance for fragment " + abstractComponentCallbacksC0635c);
    }
}
