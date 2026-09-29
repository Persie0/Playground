package p000;

import com.google.firebase.sessions.EventType;

/* JADX INFO: loaded from: classes.dex */
public final class az8 {

    /* JADX INFO: renamed from: a */
    public final EventType f7694a;

    /* JADX INFO: renamed from: b */
    public final fz8 f7695b;

    /* JADX INFO: renamed from: c */
    public final C3384nt f7696c;

    public az8(EventType eventType, fz8 fz8Var, C3384nt c3384nt) {
        eventType.getClass();
        this.f7694a = eventType;
        this.f7695b = fz8Var;
        this.f7696c = c3384nt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof az8)) {
            return false;
        }
        az8 az8Var = (az8) obj;
        return this.f7694a == az8Var.f7694a && this.f7695b.equals(az8Var.f7695b) && this.f7696c.equals(az8Var.f7696c);
    }

    public final int hashCode() {
        return this.f7696c.hashCode() + ((this.f7695b.hashCode() + (this.f7694a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + this.f7694a + ", sessionData=" + this.f7695b + ", applicationInfo=" + this.f7696c + ')';
    }
}
