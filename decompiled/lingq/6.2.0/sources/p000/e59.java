package p000;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class e59 {

    /* JADX INFO: renamed from: b */
    public static final hc1 f36728b;

    /* JADX INFO: renamed from: a */
    public final Context f36729a;

    static {
        gc1 gc1VarM13189b = hc1.m13189b(e59.class);
        gc1VarM13189b.m12471a(lb2.m16059c(g06.class));
        gc1VarM13189b.m12471a(lb2.m16059c(Context.class));
        gc1VarM13189b.f40520f = new g9c(29);
        f36728b = gc1VarM13189b.m12472b();
    }

    public e59(Context context) {
        this.f36729a = context;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized String m10856a() {
        String string = this.f36729a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.f36729a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }
}
