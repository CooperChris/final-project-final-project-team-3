package com.example.android.usdaplantindex.data;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.io.Serializable;

@Entity(tableName = "plants")
public class PlantInfo implements Serializable {
    @NonNull
    @PrimaryKey
    public Integer id;

    public String Scientific_Name_x;

    public String Scientific_Name_y;

    public String Common_Name;

    public String Symbol;

    public String Duration;

    public String Growth_Habit;

    public String Native_Status;

    public String Category;

    public String Parents;

    public String Forma;
    public String Forma_Prefix;

    public String Variety;
    public String Variety_Prefix;
    public String Hybrid_Variety_Indicator;

    public String Subvariety;
    public String Subvariety_Prefix;

    public String Species;
    public String Hybrid_Species_Indicator;

    public String Subspecies;
    public String Subspecies_Prefix;
    public String Hybrid_Subspecies_Indicator;

    public String Genus;
    public String Hybrid_Genus_Indicator;

    public String Family;
    public String Family_Symbol;
    public String Family_Common_Name;

    public String xOrder;

    public String Class;
    public String SubClass;

    public String Division;
    public String SubDivision;
    public String SuperDivision;

    public String Kingdom;
    public String SubKingdom;

    public String State_and_Province;

    public String Federal_T_E_Status;
    public String Federal_Noxious_Status;

    public String State_T_E_Status;
    public String State_T_E_Common_Name;
    public String State_Noxious_Status;
    public String State_Noxious_Common_Name;

    public String Genera_Binomial_Author;
    public String Trinomial_Author;
    public String Quadranomial_Author;
    public String Questionable_Taxon_Indicator;

    public String Invasive;

    public String Accepted_Symbol_y;
    public String Synonym_Symbol_y;

    public String Active_Growth_Period;
    public String After_Harvest_Regrowth_Rate;
    public String Bloat;
    public String C_N_Ratio;
    public String Coppice_Potential;
    public String Fall_Conspicuous;
    public String Fire_Resistance;
    public String Flower_Color;
    public String Flower_Conspicuous;
    public String Foliage_Color;
    public String Foliage_Porosity_Summer;
    public String Foliage_Porosity_Winter;
    public String Foliage_Texture;
    public String Fruit_Color;
    public String Fruit_Conspicuous;
    public String Growth_Form;
    public String Growth_Rate;
    public String Height_at_Base_Age_Maximum_feet;
    public String Height_Mature_feet;
    public String Known_Allelopath;
    public String Leaf_Retention;
    public String Lifespan;
    public String Low_Growing_Grass;
    public String Nitrogen_Fixation;
    public String Resprout_Ability;
    public String Shape_and_Orientation;
    public String Toxicity;
    public String Adapted_to_Coarse_Textured_Soils;
    public String Adapted_to_Medium_Textured_Soils;
    public String Adapted_to_Fine_Textured_Soils;
    public String Anaerobic_Tolerance;
    public String CaCO_3_Tolerance;
    public String Cold_Stratification_Required;
    public String Drought_Tolerance;
    public String Fertility_Requirement;
    public String Fire_Tolerance;
    public String Frost_Free_Days_Minimum;
    public String Hedge_Tolerance;
    public String Moisture_Use;
    public String pH_Minimum;
    public String pH_Maximum;
    public String Planting_Density_per_Acre_Minimum;
    public String Planting_Density_per_Acre_Maximum;
    public String Precipitation_Minimum;
    public String Precipitation_Maximum;
    public String Root_Depth_Minimum_inches;
    public String Salinity_Tolerance;
    public String Shade_Tolerance;
    public String Temperature_Minimum_F;
    public String Bloom_Period;
    public String Commercial_Availability;
    public String Fruit_Seed_Abundance;
    public String Fruit_Seed_Period_Begin;
    public String Fruit_Seed_Period_End;
    public String Fruit_Seed_Persistence;
    public String Propogated_by_Bare_Root;
    public String Propogated_by_Bulbs;
    public String Propogated_by_Container;
    public String Propogated_by_Corms;
    public String Propogated_by_Cuttings;
    public String Propogated_by_Seed;
    public String Propogated_by_Sod;
    public String Propogated_by_Sprigs;
    public String Propogated_by_Tubers;
    public String Seeds_per_Pound;
    public String Seed_Spread_Rate;
    public String Seedling_Vigor;
    public String Small_Grain;
    public String Vegetative_Spread_Rate;
    public String Berry_Nut_Seed_Product;
    public String Christmas_Tree_Product;
    public String Fodder_Product;
    public String Fuelwood_Product;
    public String Lumber_Product;
    public String Naval_Store_Product;
    public String Nursery_Stock_Product;
    public String Palatable_Browse_Animal;
    public String Palatable_Graze_Animal;
    public String Palatable_Human;
    public String Post_Product;
    public String Protein_Potential;
    public String Pulpwood_Product;
    public String Veneer_Product;
}