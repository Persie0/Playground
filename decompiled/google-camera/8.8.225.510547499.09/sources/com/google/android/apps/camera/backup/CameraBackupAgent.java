package com.google.android.apps.camera.backup;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.os.ParcelFileDescriptor;
import android.preference.PreferenceManager;
import java.io.IOException;
import java.util.Map;
import p000.cmj;
import p000.emv;
import p000.fcp;
import p000.juq;
import p000.jvh;
import p000.mwx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CameraBackupAgent extends juq {

    /* JADX INFO: renamed from: a */
    public fcp f6517a;

    /* JADX INFO: renamed from: e */
    private final void m4041e() {
        if (this.f6517a == null) {
            ((cmj) ((emv) getApplicationContext()).mo4193e(cmj.class)).mo3941a(this);
        }
    }

    @Override // p000.juq
    /* JADX INFO: renamed from: a */
    protected final Map mo4042a() {
        return mwx.m17119n(PreferenceManager.getDefaultSharedPreferencesName(this), new jvh());
    }

    @Override // p000.juq, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) throws IOException {
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
        m4041e();
        this.f6517a.mo8190j();
    }

    @Override // p000.juq, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
        m4041e();
        this.f6517a.mo8191k();
    }
}
