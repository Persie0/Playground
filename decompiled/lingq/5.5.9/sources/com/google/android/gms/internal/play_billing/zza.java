package com.google.android.gms.internal.play_billing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
final class zza {
    public static final zza zza;
    public static final zza zzb;
    public static final zza zzc;
    public static final zza zzd;
    public static final zza zze;
    public static final zza zzf;
    public static final zza zzg;
    public static final zza zzh;
    public static final zza zzi;
    public static final zza zzj;
    public static final zza zzk;
    public static final zza zzl;
    public static final zza zzm;
    public static final zza zzn;
    private static final zzx zzo;
    private static final /* synthetic */ zza[] zzp;
    private final int zzq;

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r2v14 ??, r2v20 ??, r2v17 short[], r2v21 byte[]]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:676)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        */
    static {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zza.<clinit>():void");
    }

    private zza(String str, int i10, int i11) {
        super(str, i10);
        this.zzq = i11;
    }

    public static zza[] values() {
        return (zza[]) zzp.clone();
    }

    public static zza zza(int i10) {
        zzx zzxVar = zzo;
        Integer numValueOf = Integer.valueOf(i10);
        return !zzxVar.containsKey(numValueOf) ? zza : (zza) zzxVar.get(numValueOf);
    }
}
