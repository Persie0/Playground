package p000;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class qfc extends ooc {

    /* JADX INFO: renamed from: U */
    public static final Pair f57711U = new Pair("", 0L);

    /* JADX INFO: renamed from: H */
    public final C3552rx f57712H;

    /* JADX INFO: renamed from: I */
    public final ny8 f57713I;

    /* JADX INFO: renamed from: J */
    public final uec f57714J;

    /* JADX INFO: renamed from: K */
    public final qg9 f57715K;

    /* JADX INFO: renamed from: L */
    public final qg9 f57716L;

    /* JADX INFO: renamed from: M */
    public boolean f57717M;

    /* JADX INFO: renamed from: N */
    public final uec f57718N;

    /* JADX INFO: renamed from: O */
    public final uec f57719O;

    /* JADX INFO: renamed from: P */
    public final qg9 f57720P;

    /* JADX INFO: renamed from: Q */
    public final C3552rx f57721Q;

    /* JADX INFO: renamed from: R */
    public final C3552rx f57722R;

    /* JADX INFO: renamed from: S */
    public final qg9 f57723S;

    /* JADX INFO: renamed from: T */
    public final ny8 f57724T;

    /* JADX INFO: renamed from: c */
    public SharedPreferences f57725c;

    /* JADX INFO: renamed from: d */
    public SharedPreferences f57726d;

    /* JADX INFO: renamed from: e */
    public pz2 f57727e;

    /* JADX INFO: renamed from: f */
    public final qg9 f57728f;

    /* JADX INFO: renamed from: g */
    public final C3552rx f57729g;

    /* JADX INFO: renamed from: h */
    public String f57730h;

    /* JADX INFO: renamed from: i */
    public boolean f57731i;

    /* JADX INFO: renamed from: j */
    public long f57732j;

    /* JADX INFO: renamed from: k */
    public final qg9 f57733k;

    /* JADX INFO: renamed from: l */
    public final uec f57734l;

    public qfc(kjc kjcVar) {
        super(kjcVar);
        this.f57733k = new qg9(this, "session_timeout", 1800000L);
        this.f57734l = new uec(this, "start_new_session", true);
        this.f57715K = new qg9(this, "last_pause_time", 0L);
        this.f57716L = new qg9(this, "session_id", 0L);
        this.f57712H = new C3552rx(this, "non_personalized_ads");
        this.f57713I = new ny8(this, "last_received_uri_timestamps_by_source");
        this.f57714J = new uec(this, "allow_remote_dynamite", false);
        this.f57728f = new qg9(this, "first_open_time", 0L);
        lda.m16127m("app_install_time");
        this.f57729g = new C3552rx(this, "app_instance_id");
        this.f57718N = new uec(this, "app_backgrounded", false);
        this.f57719O = new uec(this, "deep_link_retrieval_complete", false);
        this.f57720P = new qg9(this, "deep_link_retrieval_attempts", 0L);
        this.f57721Q = new C3552rx(this, "firebase_feature_rollouts");
        this.f57722R = new C3552rx(this, "deferred_attribution_cache");
        this.f57723S = new qg9(this, "deferred_attribution_cache_timestamp", 0L);
        this.f57724T = new ny8(this, "default_event_parameters");
    }

    @Override // p000.ooc
    /* JADX INFO: renamed from: E */
    public final boolean mo12250E() {
        return true;
    }

    /* JADX INFO: renamed from: H */
    public final SharedPreferences m19930H() {
        mo12359D();
        m18192F();
        lda.m16130p(this.f57725c);
        return this.f57725c;
    }

    /* JADX INFO: renamed from: I */
    public final SharedPreferences m19931I() {
        mo12359D();
        m18192F();
        if (this.f57726d == null) {
            kjc kjcVar = (kjc) this.f60774a;
            String strValueOf = String.valueOf(kjcVar.f47433a.getPackageName());
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            occ occVar = xccVar.f68076I;
            String strConcat = strValueOf.concat("_preferences");
            occVar.m17924b(strConcat, "Default prefs file");
            this.f57726d = kjcVar.f47433a.getSharedPreferences(strConcat, 0);
        }
        return this.f57726d;
    }

    /* JADX INFO: renamed from: J */
    public final SparseArray m19932J() {
        Bundle bundleM17688P = this.f57713I.m17688P();
        int[] intArray = bundleM17688P.getIntArray("uriSources");
        long[] longArray = bundleM17688P.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            xcc xccVar = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17923a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    /* JADX INFO: renamed from: K */
    public final npc m19933K() {
        mo12359D();
        return npc.m17583c(m19930H().getInt("consent_source", 100), m19930H().getString("consent_settings", "G1"));
    }

    /* JADX INFO: renamed from: L */
    public final void m19934L(boolean z) {
        mo12359D();
        xcc xccVar = ((kjc) this.f60774a).f47438f;
        kjc.m15280l(xccVar);
        xccVar.f68076I.m17924b(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor editorEdit = m19930H().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: M */
    public final boolean m19935M(long j) {
        return j - this.f57733k.m19952g() > this.f57715K.m19952g();
    }
}
