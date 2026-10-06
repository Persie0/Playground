package p000;

import com.google.googlex.gcam.BuildPayloadBurstSpecOptions;
import com.google.googlex.gcam.GcamModuleJNI;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eba {

    /* JADX INFO: renamed from: a */
    public boolean f13186a;

    /* JADX INFO: renamed from: c */
    public boolean f13188c;

    /* JADX INFO: renamed from: d */
    public boolean f13189d;

    /* JADX INFO: renamed from: e */
    public boolean f13190e;

    /* JADX INFO: renamed from: f */
    public boolean f13191f;

    /* JADX INFO: renamed from: h */
    private final dhv f13193h;

    /* JADX INFO: renamed from: i */
    private final edk f13194i;

    /* JADX INFO: renamed from: j */
    private final ebq f13195j;

    /* JADX INFO: renamed from: b */
    public Boolean f13187b = null;

    /* JADX INFO: renamed from: g */
    public Optional f13192g = Optional.empty();

    public eba(dhv dhvVar, edk edkVar, ebq ebqVar) {
        this.f13193h = dhvVar;
        this.f13194i = edkVar;
        this.f13195j = ebqVar;
    }

    /* JADX INFO: renamed from: a */
    public final BuildPayloadBurstSpecOptions m7037a() {
        int iIntValue;
        BuildPayloadBurstSpecOptions buildPayloadBurstSpecOptions = new BuildPayloadBurstSpecOptions();
        GcamModuleJNI.BuildPayloadBurstSpecOptions_shasta_zsl_set(buildPayloadBurstSpecOptions.f8232a, buildPayloadBurstSpecOptions, this.f13186a);
        Boolean bool = this.f13187b;
        if (bool != null) {
            buildPayloadBurstSpecOptions.m4909d(bool.booleanValue());
        } else {
            buildPayloadBurstSpecOptions.m4909d(this.f13193h.mo6184l(did.f11441at));
        }
        if (this.f13186a) {
            float fFloatValue = ((Float) this.f13193h.mo6180h(did.f11403N).orElse(Float.valueOf(-1.0f))).floatValue();
            float fMax = Math.max(66.666664f, fFloatValue);
            buildPayloadBurstSpecOptions.m4907b(fFloatValue);
            buildPayloadBurstSpecOptions.m4908c(fMax);
        }
        dhv dhvVar = this.f13193h;
        dhx dhxVar = did.f11416a;
        dhvVar.mo6175c();
        if (this.f13186a && this.f13193h.mo6173a(did.f11454h).isPresent()) {
            iIntValue = ((Integer) this.f13193h.mo6173a(did.f11454h).get()).intValue();
        } else if (!this.f13188c) {
            iIntValue = -1;
        } else if (this.f13189d || !this.f13191f) {
            iIntValue = ((Integer) this.f13193h.mo6173a(did.f11452f).get()).intValue();
        } else {
            this.f13193h.mo6175c();
            iIntValue = ((Integer) this.f13193h.mo6173a(did.f11455i).get()).intValue();
        }
        GcamModuleJNI.BuildPayloadBurstSpecOptions_max_frame_count_set(buildPayloadBurstSpecOptions.f8232a, buildPayloadBurstSpecOptions, iIntValue);
        if (this.f13188c) {
            this.f13193h.mo6180h(did.f11391B).ifPresentOrElse(new dco(buildPayloadBurstSpecOptions, 5), new dgq(this, buildPayloadBurstSpecOptions, 15));
            if (this.f13189d) {
                buildPayloadBurstSpecOptions.m4908c(true != this.f13190e ? Float.POSITIVE_INFINITY : 15000.0f);
            } else if (this.f13191f) {
                this.f13193h.mo6175c();
            } else {
                buildPayloadBurstSpecOptions.m4908c(6000.0f);
            }
            if (this.f13192g.isPresent() && ((Long) this.f13192g.get()).longValue() > 0) {
                this.f13193h.mo6175c();
                if (!this.f13189d) {
                    this.f13192g.get();
                    buildPayloadBurstSpecOptions.m4908c(((Long) this.f13192g.get()).longValue());
                }
            }
        }
        GcamModuleJNI.BuildPayloadBurstSpecOptions_include_ultra_short_frame_set(buildPayloadBurstSpecOptions.f8232a, buildPayloadBurstSpecOptions, this.f13195j.m7074f(this.f13194i) && this.f13193h.mo6184l(did.f11440as));
        return buildPayloadBurstSpecOptions;
    }
}
