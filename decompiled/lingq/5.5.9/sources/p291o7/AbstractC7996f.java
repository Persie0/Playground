package p291o7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import dm.C5207g;
import p067d8.C5056a0;
import p067d8.C5086z;
import p498y3.C10289a;

/* JADX INFO: renamed from: o7.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7996f {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f43529d = 0;

    /* JADX INFO: renamed from: a */
    public final a f43530a;

    /* JADX INFO: renamed from: b */
    public final C10289a f43531b;

    /* JADX INFO: renamed from: c */
    public boolean f43532c;

    /* JADX INFO: renamed from: o7.f$a */
    public final class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC7996f f43533a;

        public a(AbstractC7996f abstractC7996f) {
            C5207g.m11111f(abstractC7996f, "this$0");
            this.f43533a = abstractC7996f;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            C5207g.m11111f(context, "context");
            C5207g.m11111f(intent, "intent");
            if (C5207g.m11106a("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction())) {
                C5086z c5086z = C5086z.f33015a;
                int i10 = AbstractC7996f.f43529d;
                C5086z.m10807F("f", "AccessTokenChanged");
                this.f43533a.mo15866a();
            }
        }
    }

    public AbstractC7996f() {
        C5056a0.m10747e();
        a aVar = new a(this);
        this.f43530a = aVar;
        C10289a c10289aM19281a = C10289a.m19281a(C8004n.m15871a());
        C5207g.m11110e(c10289aM19281a, "getInstance(FacebookSdk.getApplicationContext())");
        this.f43531b = c10289aM19281a;
        if (this.f43532c) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        c10289aM19281a.m19282b(aVar, intentFilter);
        this.f43532c = true;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo15866a();
}
