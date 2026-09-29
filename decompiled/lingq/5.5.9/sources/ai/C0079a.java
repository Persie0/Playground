package ai;

import androidx.activity.result.C0204c;
import androidx.sqlite.p018db.framework.FrameworkSQLiteDatabase;
import p234l4.AbstractC7252b;

/* JADX INFO: renamed from: ai.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0079a {

    /* JADX INFO: renamed from: a */
    public static final a f211a = new a();

    /* JADX INFO: renamed from: b */
    public static final b f212b = new b();

    /* JADX INFO: renamed from: c */
    public static final c f213c = new c();

    /* JADX INFO: renamed from: ai.a$a */
    public static final class a extends AbstractC7252b {
        public a() {
            super(232, 233);
        }

        @Override // p234l4.AbstractC7252b
        /* JADX INFO: renamed from: a */
        public final void mo465a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            C0204c.m860t(frameworkSQLiteDatabase, "CREATE TABLE IF NOT EXISTS `_new_LibraryCounter` (`id` INTEGER NOT NULL, `type` TEXT NOT NULL, `roseGiven` INTEGER NOT NULL, `progress` REAL, `listenTimes` REAL, `readTimes` REAL, `isTaken` INTEGER NOT NULL, `difficulty` REAL NOT NULL, `rosesCount` INTEGER NOT NULL, `newWordsCount` INTEGER NOT NULL, `knownWordsCount` INTEGER NOT NULL, `cardsCount` INTEGER NOT NULL, `lessonsCount` INTEGER NOT NULL, `isCompletelyTaken` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`, `type`))", "INSERT INTO `_new_LibraryCounter` (`listenTimes`,`isTaken`,`cardsCount`,`knownWordsCount`,`type`,`newWordsCount`,`lessonsCount`,`difficulty`,`readTimes`,`roseGiven`,`rosesCount`,`progress`,`id`) SELECT `listenTimes`,`isTaken`,`cardsCount`,`knownWordsCount`,`type`,`newWordsCount`,`lessonsCount`,`difficulty`,`readTimes`,`roseGiven`,`rosesCount`,`progress`,`id` FROM `LibraryCounter`", "DROP TABLE `LibraryCounter`", "ALTER TABLE `_new_LibraryCounter` RENAME TO `LibraryCounter`");
            frameworkSQLiteDatabase.mo4600u("CREATE INDEX IF NOT EXISTS `index_LibraryCounter_id_type` ON `LibraryCounter` (`id`, `type`)");
        }
    }

    /* JADX INFO: renamed from: ai.a$b */
    public static final class b extends AbstractC7252b {
        public b() {
            super(244, 245);
        }

        @Override // p234l4.AbstractC7252b
        /* JADX INFO: renamed from: a */
        public final void mo465a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            frameworkSQLiteDatabase.mo4600u("ALTER TABLE `Card` ADD COLUMN `jyutping` TEXT DEFAULT NULL");
        }
    }

    /* JADX INFO: renamed from: ai.a$c */
    public static final class c extends AbstractC7252b {
        public c() {
            super(247, 248);
        }

        @Override // p234l4.AbstractC7252b
        /* JADX INFO: renamed from: a */
        public final void mo465a(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            frameworkSQLiteDatabase.mo4600u("ALTER TABLE `Card` ADD COLUMN `gTags` TEXT NOT NULL DEFAULT ''");
            frameworkSQLiteDatabase.mo4600u("ALTER TABLE `Word` ADD COLUMN `gTags` TEXT NOT NULL DEFAULT ''");
        }
    }
}
