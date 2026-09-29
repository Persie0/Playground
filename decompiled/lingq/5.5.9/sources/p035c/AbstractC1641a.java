package p035c;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import dm.C5207g;
import java.io.Serializable;

/* JADX INFO: renamed from: c.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1641a<I, O> {

    /* JADX INFO: renamed from: c.a$a */
    public static final class a<T> {

        /* JADX INFO: renamed from: a */
        public final T f9201a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Serializable serializable) {
            this.f9201a = serializable;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Intent mo3677a(ComponentActivity componentActivity, Object obj);

    /* JADX INFO: renamed from: b */
    public a mo5338b(ComponentActivity componentActivity, Object obj) {
        C5207g.m11111f(componentActivity, "context");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo3678c(Intent intent, int i10);
}
